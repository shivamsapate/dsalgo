package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree19 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static Node predecessor;
    static Node Successor;
    static int state;

    public static void predecessorAndSuccessor(Node root, int data) {
        if (state == 0) {
            if (root.data == data) {
                state = 1;
            } else {
                predecessor = root;
            }
        } else if (state == 1) {
            Successor = root;
            state = 2;
        }
        for (Node child : root.children) {
            predecessorAndSuccessor(child, data);
        }
    }

    public static void display(Node root) {
        String str = root.data + "-->";
        for (Node child : root.children) {
            str += child.data + " ";
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
        predecessorAndSuccessor(root, 90);
        System.out.println("predecessor :" + predecessor.data + " Successor " + Successor.data);
    }
}
