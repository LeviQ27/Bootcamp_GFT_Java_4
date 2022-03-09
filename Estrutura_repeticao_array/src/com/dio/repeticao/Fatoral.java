package com.dio.repeticao;

import java.util.Scanner;

public class Fatoral {
    

    public static void main(String[] args) {
        


        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int num = scan.nextInt();

        int multiplicador = 1;

        System.out.println(num + "! = ");
        for (int i = num; i >= 1; i--) 
        {
            multiplicador *= i;    
        }

        System.out.println(multiplicador);



    }



}
