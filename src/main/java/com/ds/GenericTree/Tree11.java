package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Tree11 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    //Mirror of generic Tree
    public static void mirrorOfTree(Node root){
        for(Node child : root.children){
            mirrorOfTree(child);
        }   
        Collections.reverse(root.children);
    }

    public static void display(Node root){
        String str = root.data+"-->";
        for(Node child : root.children){
            str+=child.data +",";
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1)
                st.pop();
            else {
                Node temp = new Node();
                temp.data = arr[i];

                if (!st.empty())
                    st.peek().children.add(temp);
                else
                    root = temp;
                st.push(temp);
            }
        }
        mirrorOfTree(root);
        display(root);
    }
}
