package com.dio.repeticao;

import java.util.Scanner;

public class MaiorEMedia {
    

    public static void main(String[] args) {
        


        Scanner scan = new Scanner(System.in);

        int num;
        int maior = 0;
        int sum = 0;

        int i = 0;

        do {
            

            System.out.println("Número: ");
            num = scan.nextInt();

            sum += num;
            if (num > maior) maior = num;

            i++;

        } while (i < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (sum/5));




    }


}
