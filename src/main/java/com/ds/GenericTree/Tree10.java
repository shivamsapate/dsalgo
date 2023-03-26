package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree10 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    // Linearize a generic tree
    public static void linearize(Node root){
        for(Node child : root.children){
            linearize(child);
        }
        while(root.children.size() > 1){
            Node lastChild = root.children.remove(root.children.size()-1);
            Node secondLast = root.children.get(root.children.size()-1);
            Node secondLastTail = getTail(secondLast);
            secondLastTail.children.add(lastChild);
        }
    }

    public static Node getTail(Node root){
        while(root.children.size()>0){
            root = root.children.get(0);
        }
        return root;
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
        linearize(root);
        display(root);
    }
}
