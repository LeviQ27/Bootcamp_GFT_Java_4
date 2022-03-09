package com.dio.array;

import java.util.Random;

public class ArrayMulti
{
    

    public static void main(String[] args) 
    {
        

        Random random = new Random();

        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) 
        {

            for (int j = 0; j < m[i].length; j++) 
            {

                m[i][j] = random.nextInt(9);
                
            }
            
        }

        System.out.println("Matriz: ");
        for (int[] linha : m) 
        {

            for (int coluna : linha) 
            {

                System.out.println(coluna + " ");
                
            }
            System.out.println();
            
        }



    }


}
