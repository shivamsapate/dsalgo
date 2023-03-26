package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree12 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

    }

    public static boolean find(Node root, int num){
        if(root.data == num)
            return true;
        for(Node child : root.children){
            boolean result = find(child, num);
            if(result)
                return result;
        }
        return false;
    }

    public static void display(Node root){
        String str = root.data+  "-->";
        for(Node child : root.children){
            str+= child.data +","; 
        }
        System.out.println(str);
        for(Node child : root.children){
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
                st.pop();
            else {
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
        System.out.println(find(root, 1100));
    }
}
