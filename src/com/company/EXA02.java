package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by 54167208T on 01/12/2016.
 */
public class EXA02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[10];
        int notamax = 0;
        int notamin = 10;

        System.out.println("Dame notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota numero "+(i+1)+":");
            notas[i]=scanner.nextInt();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota numero "+(i+1)+" es: ");
            System.out.println(notas[i]);
        }

        for (int i = 0; i < notas.length; i++) {
            if (notamax < notas[i]) {
                notamax = notas[i];
            }
        }
        for (int i = 0; i < notas.length; i++) {
            if (notamin > notas[i]) {
                notamin = notas[i];
            }
        }
        System.out.println("Nota mes alta es:"+notamax);
        System.out.println("Nota mes baixa es:"+notamin);

    }
}
