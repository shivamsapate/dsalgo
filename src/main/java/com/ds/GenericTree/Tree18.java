package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree18 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static boolean mirror(Node root1, Node root2){
        if(root1.children.size() != root2.children.size()){
            return false;
        }

        for(int i = 0; i < root1.children.size(); i++){
            int j = root2.children.size()-1-i;
            Node childNode1 = root1.children.get(i);
            Node childNode2 = root2.children.get(j);
            if(!mirror(childNode1, childNode2))
                return false;
        }
        return true;
    }

    public static boolean isSymmetrical(Node root) {
        return mirror(root, root);  //if mirror image of itself is same then we call it is symmetrical
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
        for (int ele : arr) {
            if (ele == -1)
                st.pop();
            else {
                Node temp = new Node();
                temp.data = ele;

                if (!st.empty()) {
                    st.peek().children.add(temp);
                } else
                    root = temp;
                st.push(temp);
            }
        }
        display(root);
        System.out.println(isSymmetrical(root));
    }
}
