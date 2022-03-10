package com.dio.array;

import java.util.Scanner;

public class Consoantes 
{
    

    public static void main(String[] args) 
    {
        


        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int qtdCs = 0; // Quantidade de Consoantes

        int cnt = 0; // Contador
        do 
        {

            System.out.println("Letra: ");
            String letra = scan.next();

            if 
            (

                !(
                    letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")
                )

            ) 
            {

                consoantes[cnt] = letra;
                qtdCs++;
                
            }

            cnt++;
            
        } while (cnt < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) 
        {

            if (consoante != null) 
            {

                System.out.println(consoante + " ");
                
            }
            
        }

        System.out.println("Quantidade de Consoantes: " + qtdCs);
        System.out.println(consoantes.length);



    }


}
