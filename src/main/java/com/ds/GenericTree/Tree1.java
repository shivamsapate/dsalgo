package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

//create generic tree

//Node class to represent one node
class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
}

public class Tree1 {
    
    //print all elements of generic tree
    public static void display(Node node) {

        String str = node.data + "-->";
        for (Node child : node.children) {
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1)
                st.pop(); // if array value is -1 pop from stack
            else {
                // Add node to children of exiting value present in stack
                Node temp = new Node();
                temp.data = arr[i];

                if (!st.empty()) {
                    st.peek().children.add(temp);
                } else {
                    root = temp;
                }
                st.push(temp);
            }
        }
        display(root);
    }
}
