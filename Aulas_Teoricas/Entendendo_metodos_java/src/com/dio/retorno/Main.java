package com.dio.retorno;

public class Main 
{
    
    public static void main(String[] args) {
        
        //Retornos
        System.out.println("Exercício de Retorno");

        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(4, 10);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(10, 5, 8);
        System.out.println("Área do Trapézio: " + areaTrapezio);

    }

}
