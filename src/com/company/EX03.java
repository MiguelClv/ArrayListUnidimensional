package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 03/11/2016.
 */
public class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos=0;
        int negativos=0;
        int mediaposi = 0;
        int medianega = 0;
        int[] Array = new int[10];
        System.out.println("Dame 10 numeros;");
        for (int i=0; i < Array.length; i++){
            System.out.println("Numero " +(i+1) +":");
            Array[i] = scanner.nextInt();
        }
        for (int i=0; i < Array.length; i++){
            if (Array[i] > 0){
                mediaposi = Array[i] + mediaposi;
                positivos++;
            }
            else if (Array[i] < 0){
                medianega = Array[i] + medianega;
                negativos++;
            }
    }
        System.out.println("Media positiva: " + (mediaposi/positivos));
        System.out.println("Media negativa: " + (medianega/negativos));
    }
}
