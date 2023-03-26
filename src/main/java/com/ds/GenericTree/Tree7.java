package com.ds.GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree7 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    //level order traversal
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

    // In line level order traversal
    public static void inLineLevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            if(q.peek() == null){
                System.out.println();
                q.remove();
            } else {
                q.add(null);
            }

            root = q.remove();
            System.out.print(root.data + " ");
            for (Node child : root.children) {
                q.add(child);
            }
        }
    }

    //inLine Level order traversal 2nd approach with two queues
    public static void inLineLevelOrder2(Node root){
        Queue<Node> q = new ArrayDeque<>();
        Queue<Node> childq = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty() || !childq.isEmpty()){
            root = q.remove();
            System.out.print(root.data + " ");
            for(Node child : root.children){
                childq.add(child);
            }
            if(q.isEmpty()){
                q = new ArrayDeque<>(childq);
                childq.clear();
                System.out.println();
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
        // levelOrder(root);
        // inLineLevelOrder(root);
        inLineLevelOrder2(root);
    }
}
