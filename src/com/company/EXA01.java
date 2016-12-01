package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 01/12/2016.
 */
public class EXA01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[10];

        System.out.println("Dame notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota numero "+(i+1)+":");
            notas[i]=scanner.nextInt();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota numero "+(i+1)+" es: ");
            System.out.println(notas[i]);
        }

    }
}
