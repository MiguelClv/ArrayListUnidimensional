package com.company;
import java.util.Scanner;

/**
 * Created by 54167208t on 03/11/2016.
 */
public class EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        int[] Array = new int[10];
        System.out.println("Dame 10 numeros;");
        for (int i=0; i < Array.length; i++){
            System.out.println("Numero " +(i+1)+":");
            Array[i] = scanner.nextInt();
        }
        for (int a=0; a < Array.length; a++){
            if (Array[a] > 0){
                positivos++;
            }
            else if (Array[a] < 0){
                negativos++;
            }
            else if (Array[a] ==0){
                ceros++;
            }
        }
        System.out.println("Numeros Positivos: " +positivos);
        System.out.println("Numeros Negativos: " +negativos);
        System.out.println("Ceros: " +ceros);
    }
}

