package com.mruruc.Version2;

import java.util.LinkedList;

public class Vertex {
    private int vertexId;
    private String vertexName;
    private LinkedList<Edge> edgeList;
    public Vertex(int vertexId,String vertexName){
        this.vertexId=vertexId;
        this.vertexName=vertexName;
        this.edgeList=new LinkedList<>();
    }

    public int getVertexId() {
        return vertexId;
    }

    public String getVertexName() {
        return vertexName;
    }

    public void setEdgeList(Edge edge){
        edgeList.add(edge);
    }

    public LinkedList<Edge> getEdgeList() {
        return edgeList;
    }
}
