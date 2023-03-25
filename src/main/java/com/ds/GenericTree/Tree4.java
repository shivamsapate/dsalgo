package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

//minimum of generic tree
public class Tree4 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static int minimum(Node root) {
        int min = Integer.MAX_VALUE;
        for (Node child : root.children) {
            int childMin = minimum(child);
            min = Math.min(childMin, min);
        }
        return root.data < min ? root.data : min;
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
        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Stack<Node> st = new Stack<>();
        for (int e : arr) {
            if (e == -1)
                st.pop();
            else {
                Node temp = new Node();
                temp.data = e;
                if (!st.empty())
                    st.peek().children.add(temp);
                else
                    root = temp;

                st.push(temp);
            }

        }
        display(root);
        System.out.println("Minimum of number is " + minimum(root));
    }
}
