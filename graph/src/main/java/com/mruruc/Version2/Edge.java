package com.mruruc.Version2;

public class Edge {
    private int destinationVertexID;
    private int sourceId;
    private int weight;

    public Edge(int destinationVertexID,int sourceId,int weight){
        this.destinationVertexID=destinationVertexID;
        this.sourceId=sourceId;
        this.weight=weight;
    }

    public int getDestinationVertexID() {
        return destinationVertexID;
    }

    public int getWeight() {
        return weight;
    }

    public int getSourceId() {
        return sourceId;
    }
}
