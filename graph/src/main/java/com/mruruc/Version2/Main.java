package com.mruruc.Version2;

public class Main {
    public static void main(String[] args) {
        Graph pl=new Graph();
        pl.addVertex(0,"Warsaw");
        pl.addVertex(1,"Gdansk");
        pl.addVertex(2,"Krakow");
        pl.addVertex(3,"Lodz");
        pl.addVertex(4,"Wroclaw");
        pl.addVertex(5,"Poznan");
        pl.addVertex(6,"Katowice");

        pl.addEdge(0,3,50);
        pl.addEdge(0,1,100);
        pl.addEdge(0,2,160);
        pl.addEdge(0,6,220);

        pl.addEdge(1,0,100);
        pl.addEdge(1,5,300);

        pl.addEdge(2,0,160);
        pl.addEdge(2,6,300);

        pl.addEdge(3,5,170);
        pl.addEdge(3,4,60);

        pl.print();

    }
}
