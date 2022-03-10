package com.dio.repeticao;

import java.util.Scanner;

public class ParEImpar {
    
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        int quantNum;
        int num;
        int cont_par = 0, cont_impar = 0;

        System.out.println("Quantidade de números: ");
        quantNum = scan.nextInt();

        int i = 0;
        do 
        {
            
            System.out.println("Número: ");
            num = scan.nextInt();

            if (num%2 == 0) cont_par++; 
            else cont_impar++;

            i++;

        } while (i < quantNum);

        System.out.println("Quantidade de Números Pares: " + cont_par);
        System.out.println("Quantidade de Números Ímpares: " + cont_impar);


    }

}
