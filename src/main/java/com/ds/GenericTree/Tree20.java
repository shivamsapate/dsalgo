package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree20 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    //find ceil and floor values for given data 
    static int ceil;
    static int floor;
    public static void ceilAndFloor(Node root, int data){
        if(root.data > data) {
            if(root.data < ceil) {
                ceil = root.data;
            }
        }        
        if(root.data < data) {
            if(root.data > floor) {
                floor = root.data;
            }
        }
        for(Node child : root.children) {
            ceilAndFloor(child, data);
        }
    }

    public static void display(Node root) {
        String res = root.data + "-->" ;
        for(Node child : root.children){
            res+=child.data+",";
        }
        System.out.println(res);
        for(Node child : root.children){
            display(child);
        }
    }
    public static void main(String[] args) {
        Node root = null;
        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Stack<Node> st = new Stack<>();
        for(int e : arr) {
            if(e==-1) st.pop();
            else {
                Node temp = new Node();
                temp.data = e;

                if(!st.empty()) {
                    st.peek().children.add(temp);
                } else {
                    root = temp;
                }
                st.push(temp);
            }
        }
        display(root);
        ceil = Integer.MAX_VALUE; //smallest among larger
        floor = Integer.MIN_VALUE; //largest among smaller
        ceilAndFloor(root, 90);
        System.out.println("ceil " +ceil+" floor "+floor);    
    }
}
