package com.ds.graphs;

import java.util.Stack;

class Vertex{
    public char label;
    public boolean isVisited;

    public Vertex(char lab){
        this.label = lab;
        this.isVisited = false;
    }
}

public class DepthFirstSearch {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Stack<Integer> st;


    public DepthFirstSearch(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        st = new Stack<>();
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v){
        System.out.println(vertexList[v].label+" ");
    }

    public int getAdjUnVisitedVertex(int v){
        for(int i = 0; i < nVerts; i++){
            if(adjMat[v][i]==1 && vertexList[i].isVisited==false){
                return i;
            }
        }
        return -1;
    }

    public void dfs(){
        vertexList[0].isVisited = true;
        displayVertex(0);
        st.push(0);

        while(!st.isEmpty()){
            int v = getAdjUnVisitedVertex(st.peek());

            if(v == -1){
                st.pop();
            } else {
                vertexList[v].isVisited = true;
                displayVertex(v);
                st.push(v);
            }
        }
    }
}
