package com.ds.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree16 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    //check two trees are symmetrical or not
    public static boolean isSymmetrical(Node root1, Node root2){
        if(root1.children.size() != root2.children.size()){ 
            return false;
        }

        for(int i = 0; i < root1.children.size(); i++){
            Node chRoot1 = root1.children.get(i);
            Node chRoot2 = root2.children.get(i);
            if(!isSymmetrical(chRoot1, chRoot2)){
                return false;
            }
        }
        return true;
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
            boolean res = isSymmetrical(root,root);
            System.out.println(res);
    }
}
