package com.Mruruc;

public class MeasureTime {

    public static void main(String[] args) {

        long start=System.nanoTime();
        GCD.byModule((int)Math.pow(10,10),3);
        long end=System.nanoTime();
        long duration=end-start;
        System.out.println("Result for byModulo Method In NanoSecond: \n" + duration);

        long start2=System.nanoTime();
        GCD.bySubstraction((int)Math.pow(10,10),3);
        long end2=System.nanoTime();
        long duration2=end2-start2;
        System.out.println("Result for bySubtraction Method In NanoSecond: \n" + duration2);
    }
}
