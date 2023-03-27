package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree14 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    // lowest common assistor of two element
    public static int commonAssistor(Node root, int n1, int n2){
        ArrayList<Integer> first = pathToRoot(root, n1);
        ArrayList<Integer> second = pathToRoot(root, n2);
        for(int e : first){
            if (second.contains(e)){
                return e;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> pathToRoot(Node root, int num){
        if(root.data == num){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            return list; 
        }
        for(Node child : root.children){
            ArrayList<Integer> res = pathToRoot(child, num);
            if(!res.isEmpty()){
                res.add(root.data);
                return res;
            }

        }
        return new ArrayList<>();
    }

    public static void display(Node root) {
        String str = root.data + " --> ";
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
        System.out.println(pathToRoot(root, 110));
        System.out.println(commonAssistor(root, 110, 30));
    }
}
