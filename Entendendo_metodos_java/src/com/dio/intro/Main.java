package com.dio.intro;

/**
 * Classe principal dos exercícios da Aula 1de Métodos
 */

public class Main {

    public static void main(String[] args) {
        

        // Calculadora
        System.out.println("Exercício da Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);



    }
    
}
