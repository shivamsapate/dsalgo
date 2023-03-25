package com.ds.GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Tree7 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void levelOrder(Node root) {
        Queue<Node> que = new ArrayDeque<>();
        que.add(root);
        while (!que.isEmpty()) {
            root = que.remove();
            System.out.println(root.data + " ");
            for (Node child : root.children) {
                que.add(child);
            }
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
        int arr[] = { 10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1 };
        Node root = null;

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
        levelOrder(root);
    }
}
