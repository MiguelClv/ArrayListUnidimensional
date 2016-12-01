package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 01/12/2016.
 */
public class EXA03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int suma= 0;

        System.out.println("Dame 15 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Nota numero " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        for (int i =0; i<numeros.length;i++){
            suma = suma + numeros[i];
        }
        System.out.println("La suma de tots els numeros es: "+suma);
    }
}
