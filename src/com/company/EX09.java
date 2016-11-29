package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 29/11/2016.
 */
public class EX09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numtotales,contador = 0;

        do{
            System.out.println("¿Cuantos numeros son? ");
            numtotales = scanner.nextInt();
        }while(numtotales<=0);

        int[] numeros = new int[numtotales];

        System.out.println("Dime los numeros y te devolvere los que acaben en 2: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numero " + (i+1) +":");
            numeros[i] = scanner.nextInt();
        }
        for ( int i = 0; i < numeros.length; i++) {
            if(numeros[i]%10==2){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" numeros que acaban en 2.");
    }
}
