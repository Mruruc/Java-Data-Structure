package com.mruruc.adjacencymatrix;

import java.util.ArrayList;


public class Graph {
    private ArrayList<Vertex> vertexs;
    private int[][] matrix;
    public Graph(int size){
        this.vertexs=new ArrayList<>();
        this.matrix=new int[size][size];
    }

    public void addVertex(char data){
        Vertex vertex=new Vertex(data);
      vertexs.add(vertex);
    }

    public void  addEdge(int src,int dst){
       matrix[src][dst]=1;
    }

    public boolean checkEdge(int src,int dst){
        return matrix[src][dst]==1;
    }

    public void print() {
        System.out.print("  ");
        for(Vertex vertex: vertexs){
            System.out.print(vertex.getData()+"  ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(vertexs.get(i).getData()+" ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
