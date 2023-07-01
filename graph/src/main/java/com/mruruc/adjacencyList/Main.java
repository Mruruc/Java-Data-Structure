package com.mruruc.adjacencyList;

public class Main {
    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addVertex(new Vertex('A'));
        graph.addVertex(new Vertex('B'));
        graph.addVertex(new Vertex('C'));
        graph.addVertex(new Vertex('D'));
        graph.addVertex(new Vertex('E'));

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,0);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,0);
        graph.addEdge(2,1);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.addEdge(3,2);
        graph.print();


    }
}
