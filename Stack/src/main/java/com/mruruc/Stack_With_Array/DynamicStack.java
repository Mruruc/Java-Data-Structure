package com.mruruc.Stack_With_Array;

public class DynamicStack extends Stack{

    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public void push(int data) {
       if(isFull()){
           doubleSize();
       }
       super.push(data);
    }

    public void doubleSize() {
        int[] temp=new int[getArr().length*2];
        for (int i = 0; i <getArr().length; i++) {
            temp[i]=getArr()[i];
        }
        setArr(temp);
    }

}
