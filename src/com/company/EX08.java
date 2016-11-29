package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 29/11/2016.
 */
public class EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, numopc, resto;

        String binario = "";

        System.out.println("Dame un numero decimal y lo convertire en binario");
        numero = scanner.nextInt();

        numopc = numero;
        while(numopc >= 2){
            resto = numopc % 2;
            if(resto == 1) {
                binario = "1" + binario;
            } else {
                binario = "0" + binario;
            } numopc = numopc / 2;
        }
        if(numopc == 1) {
            binario = "1" + binario;
        } else {
            binario = "0" + binario;
        }
        System.out.println("El numero :" + numero + " en binario es: " + binario);
    }

}
