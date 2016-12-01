package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 29/11/2016.
 */
public class EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int contnum = 0;
        int acumuladornum = 0;

        System.out.println("Dime los numeros y te calculare la media de los que esten en posicion par: ");
        for ( int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i) +":");
            numeros[i] = scanner.nextInt();
            if (i%2==0){
                acumuladornum = acumuladornum + numeros[i];
                contnum++;
            }
        }
        double mediatotal = acumuladornum/contnum;
        System.out.println("Suma de los numero pares de la lista: "+acumuladornum);
        System.out.println("Numeros pares totales: "+contnum);
        System.out.println("Media total: "+mediatotal);
    }
}
