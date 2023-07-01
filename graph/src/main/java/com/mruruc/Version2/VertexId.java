package com.mruruc.Version2;

import java.util.HashMap;

public class VertexId {
    HashMap<Integer,String> vertexId;
    VertexId(){
        this.vertexId=new HashMap<>();
    }
    public void saveVertexId(Integer id,String vertexName){
        vertexId.put(id,vertexName);
    }

    public String findNameById(Integer id){
        //should take id of vertex and return the vertex name
        return vertexId.get(id);
    }
}
