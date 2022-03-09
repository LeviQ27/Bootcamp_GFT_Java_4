package com.dio.repeticao;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        

        Scanner sca = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = sca.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = sca.nextInt();
        }


    }
    
}
