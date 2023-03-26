package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree13 {
    private static class Node {
        int data;
        ArrayList<Node> childern = new ArrayList<>();

    }

    //path to root node
    public static ArrayList<Integer> pathToRoot(Node root, int num) {
        if (root.data == num) {
            ArrayList<Integer> lst = new ArrayList<>();
            lst.add(root.data);
            return lst;
        }

        for (Node child : root.childern) {
            ArrayList<Integer> res = pathToRoot(child, num);
            if (!res.isEmpty()) {
                res.add(root.data);
                return res;
            }
        }
        return new ArrayList<>();
    }

    public static void display(Node root) {
        String str = root.data + "-->";
        for (Node child : root.childern) {
            str += child.data + ",";
        }
        System.out.println(str);
        for (Node child : root.childern) {
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
                    st.peek().childern.add(temp);
                } else
                    root = temp;
                st.push(temp);
            }
        }
        System.out.println(pathToRoot(root, 110));
    }
}
