package com.dio.repeticao;

import java.util.Scanner;

public class Tabuada {


    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num);
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(num + "x" + i + "=" + (num*i));    
        }



    }

    
}
