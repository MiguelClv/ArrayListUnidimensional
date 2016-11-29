package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 25/11/2016.
 */
public class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[20];
        int[] sueldos = new int[20];

        int i =0;
        int msueldo = sueldos[i];
        String mnombre = nombres[i];

        System.out.println("Dime los nombres y sueldos de las personas: ");
        for ( i = 0; i < 20; i++) {
            scanner.nextLine();
            System.out.println("Persona numero " + (i+1) +":");
            System.out.println("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.println("Sueldo: ");
            sueldos[i] = scanner.nextInt();

            if (sueldos[i] > msueldo){
                msueldo = sueldos[i];
                mnombre = nombres[i];
            }
        }

        System.out.println("Nombre del que mas cobra: " +mnombre);
        System.out.println("Su sueldo es: "+msueldo);
    }
}
