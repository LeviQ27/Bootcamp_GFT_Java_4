package com.dio.array;

import java.util.Random;

public class NumerosAleatorios 
{
    

    public static void main(String[] args) 
    {
        

        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++) 
        {

            int num = random.nextInt(100);
            numAleatorios[i] = num;
            
        }

        System.out.println("Números Aleatórios: ");
        for (int numero : numAleatorios) 
        {

            System.out.println(numero + " ");
            
        }

        System.out.println("\nAntecessor dos Números Aleatórios: ");
        for (int numero : numAleatorios) 
        {

            System.out.println((numero-1) + " ");
            
        }

        System.out.println("\nSucessores dos Números Aleatórios: ");
        for (int numero : numAleatorios) 
        {

            System.out.println((numero+1) + " ");
            
        }



    }


}
