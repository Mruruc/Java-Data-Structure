package com.mruruc.Version2;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Graph {
    private ArrayList<Vertex> vertices;
    private VertexId vertexSave;

    Graph(){
        this.vertexSave=new VertexId();
        this.vertices =new ArrayList<>();
    }

    public boolean addVertex(int vertexId,String vertexName){
        if(existsById(vertexId)){
            return false;
        }
        Vertex newVertex=new Vertex(vertexId,vertexName);
        vertexSave.saveVertexId(vertexId,vertexName);
        return vertices.add(newVertex);
    }


    public void updateVertex(){

    }

    public void deleteEdge(){}
    public void updateEdge(){}



      public boolean addEdge(int destinationVertexID, int sourceId, int weight) {
            if (!existsById(destinationVertexID)) {
                throw new NoSuchElementException("Id Does Not Exists!");
            }
            if (!existsById(sourceId)) {
                throw new NoSuchElementException("No Such A Vertex!");
            }

            if (isEdgeExists(destinationVertexID, sourceId)) {
                throw new IllegalArgumentException("Edge is already Exists!");
            }

            Vertex vertexDest = null;

            for (Vertex vertex : vertices) {
                if (vertex.getVertexId() == destinationVertexID) {
                    vertexDest = vertex;
                    break;
                }
            }

            if (vertexDest == null ) {
                throw new NoSuchElementException("Vertex not found!");
            }
            vertexDest.setEdgeList(new Edge(destinationVertexID, sourceId, weight));

            return true;
        }


    public boolean isEdgeExists(int destId,int sourceId){
        for(Vertex vertex:vertices){
            for(Edge edge: vertex.getEdgeList()){
                if(edge.getDestinationVertexID()==destId && edge.getSourceId()==sourceId){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean existsById(int id){
        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i).getVertexId()==id){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(Vertex vertex: vertices){
            System.out.print(vertex.getVertexName()+" : ");
            for(Edge edg: vertex.getEdgeList()){
                System.out.print(vertexSave.findNameById(edg.getSourceId())+"-->"+edg.getWeight()+",  ");
            }
            System.out.println();

        }
    }




}
