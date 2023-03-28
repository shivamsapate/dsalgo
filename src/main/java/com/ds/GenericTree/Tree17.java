package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree17 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    //Mirror image of tree
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

    public static void display(Node root) {
        String str = root.data + "-->";
        for(Node child : root.children) {
            str += child.data + ",";
        }
        System.out.println(str);
        for(Node child : root.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
    
        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
            -1 };

        int arr2[] = {10,20,50,-1,-1,30,60,-1,70,110,-1,120,-1,-1,80,-1,-1,40,90,-1,100,-1,-1};

        Node root = addData( arr);
        Node root2 = addData(arr2);
        System.out.println(mirror(root, root2));
     
    }

    public static Node addData(int[] arr){
        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int ele : arr){
            if(ele == -1) st.pop();
            else {
                Node temp = new Node();
                temp.data = ele;

                if(!st.empty()){
                    st.peek().children.add(temp);
                } else 
                    root = temp;
                st.push(temp);
            }
        }
        return root;
    }
}
