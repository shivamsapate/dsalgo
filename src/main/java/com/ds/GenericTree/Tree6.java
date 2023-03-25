package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree6 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void traversal(Node root){
        System.out.println("Node pre "+root.data);
        
        for(Node child : root.children){
            System.out.println("Edge pre "+root.data+"-"+ child.data);
            traversal(child);
            System.out.println("Edge post "+root.data+"-"+ child.data);
        }
        System.out.println("Node post "+ root.data);
    }

    public static void display(Node root){
        String str = root.data+"-->";
        for(Node child : root.children){
            str += child.data+",";
        }
        System.out.println(str);

        for(Node child : root.children){
            display(child);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, -1, 30, 50, -1, 60, -1, -1 ,40, -1 , -1};
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int e : arr) {
            if (e == -1)
                st.pop();
            else {
                Node temp = new Node();
                temp.data = e;
                if(!st.empty())
                    st.peek().children.add(temp);
                else
                    root = temp;
                st.push(temp);
            }
        }
        // display(root);
        traversal(root);
    }
}
