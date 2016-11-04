package com.company;

public class EX01 {

    public static void main(String[] args) {
        int parell = 2;

        int[] Array = new int[20];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = parell;
            parell += 2;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
