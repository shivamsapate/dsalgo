package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree5 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    //calculating height with edges not via nodes
    public static int heightTree(Node root){
        int height = -1;
        for(Node child : root.children){
            int childHeight = heightTree(child);
            height = Math.max(childHeight, height);
        }
       
        return 1+height;
    }

    public static void display(Node root){
        String str = root.data+"-->";
        for(Node child : root.children){
            str+=child.data+",";
        }
        System.out.println(str);
        
        for(Node child : root.children){
            display(child);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
            -1 };

        Node root = null;
        Stack<Node> st = new Stack<>();
        for(int e : arr){
            if(e==-1) st.pop();
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
        display(root);
        System.out.println("Height of Tree "+ heightTree(root));
    }
}
