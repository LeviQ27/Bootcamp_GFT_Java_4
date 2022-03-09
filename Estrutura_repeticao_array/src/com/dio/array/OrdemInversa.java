package com.dio.array;

public class OrdemInversa 
{
    

    public static void main(String[] args) 
    {
    


        int[] vetor = {-8, -5, 10, 37, 64, 1};

        System.out.println("Vetor: ");
        int cnt = 0;
        while (cnt < vetor.length) 
        {

            System.out.println(vetor[cnt] + " ");
            cnt++;
            
        }

        System.out.println("\nVetor: ");
        for (int i = vetor.length-1; i >= 0; i--) 
        {

            System.out.println(vetor[i] + " ");
            
        }


    }


}
