package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree8 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    // print elements in zigzag way for generic tree
    public static void displayZigZag(Node root) {
        Stack<Node> st = new Stack<>();
        Stack<Node> stChild = new Stack<>();
        st.push(root);
        while (!st.empty() || !stChild.empty()) {
            while (!st.empty()) {
                Node temp = st.pop();
                System.out.print(temp.data+" ");
                for(Node child : temp.children){
                    stChild.push(child);
                }
            }
            System.out.println();
            while (!stChild.empty()) {
                Node temp = stChild.pop();
                System.out.print(temp.data+" ");
                for(int i = temp.children.size() -1; i >= 0; i--){
                    st.push(temp.children.get(i));
                }
            }
            System.out.println();
        }

    }

    public static void display(Node root) {
        String str = root.data + "-->";
        for (Node child : root.children) {
            str += child.data + ",";
        }
        System.out.println(str);

        for (Node child : root.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        Stack<Node> st = new Stack<>();
        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

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
        // display(root);
        displayZigZag(root);
    }
}
