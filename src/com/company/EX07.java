package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 29/11/2016.
 */
public class EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alumnos;
        int mas = 0;
        double nota = 0;
        double medianota = 0;

        do{
            System.out.println("¿Cuantos alumnos son? ");
            alumnos = scanner.nextInt();
        }while(alumnos<=0);

        double[] notas = new double[alumnos];

        System.out.println("Dime las notas de los alumnos: ");
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Alumno numero " + (i+1) +":");
            notas[i] = scanner.nextDouble();
            nota = nota + notas[i];
        }

        medianota = nota / alumnos;

        for ( int i = 0; i < notas.length; i++) {
            if (notas[i] > medianota){
                mas++;
            }
        }

        System.out.println("Altura media: " + medianota);
        System.out.println("Personas con altura superior a la media: " + mas);

    }
}
