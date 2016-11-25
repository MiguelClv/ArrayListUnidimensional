package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 04/11/2016.
 */
public class EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personas;
        int mas = 0, menor = 0;
        double mediaAlt = 0;

        do{
            System.out.println("¿Cuantas personas son? ");
            personas = scanner.nextInt();
        }while(personas<=0);

        double[] alturas = new double[personas];

        System.out.println("Dime la altura de las personas: ");
        for (int i = 0; i < personas; i++) {
            System.out.println("Persona numero " + (i+1) +":");
            alturas[i] = scanner.nextDouble();
            mediaAlt = mediaAlt + alturas[i];
        }

        mediaAlt = mediaAlt / personas;

        for ( int i = 0; i < alturas.length; i++) {
            if (alturas[i] > mediaAlt){
                mas++;
            } else if (alturas[i] < mediaAlt){
                menor++;
            }
        }

        System.out.println("Altura media: " + mediaAlt);
        System.out.println("Personas con altura superior a la media: " + mas);
        System.out.println("Personas con altura inferior a la media: " + menor);
    }
}
