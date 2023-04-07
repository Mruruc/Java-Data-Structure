package com.Mruruc;

import java.util.ArrayList;

public class ReturningArray {

    public static ArrayList<Integer> search(int[] arr, int element,int index,ArrayList<Integer>list){

        if(index== arr.length){
            return list;
        }
        if(arr[index]==element){
            list.add(index);
        }

        return search(arr,element,index+1,list);
    }

    public static ArrayList<Integer> search2(int[] arr, int element,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index== arr.length){
            return list;
        }
        if(arr[index]==element){
            list.add(index);
        }

        ArrayList<Integer> list2= search2(arr,element,index+1);
        list.addAll(list2);
        return list;
    }
}
