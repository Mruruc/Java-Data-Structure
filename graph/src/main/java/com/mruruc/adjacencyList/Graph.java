package com.mruruc.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Vertex>> list;

    public Graph(){
        this.list=new ArrayList<>();
    }
    public void addVertex(Vertex vertex){
     LinkedList<Vertex> listVertex=new LinkedList<>();
     listVertex.add(vertex);
     list.add(listVertex);
    }
    public void addEdge(int src,int dst){
        LinkedList<Vertex> currentList=list.get(src);
        Vertex dstVertex=list.get(dst).get(0);
        list.get(src).add(dstVertex);
    }
    public void print(){
        for (LinkedList<Vertex> vertex : list){
            for(Vertex vertex2: vertex ){
                System.out.print(vertex2.getVertex()+"-->");
            }
            System.out.println();
        }
    }

}
