package com.dio.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Adição
        int soma = a + b; // 10 + 5 = 15
        System.out.println("Soma: " + soma);

        // Subtração
        int subtracao = a - b; // 10 - 5 = 5
        System.out.println("Subtração: " + subtracao);

        // Multiplicação
        int multiplicacao = a * b; // 10 * 5 = 50
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão
        int divisao = a / b; // 10 / 5 = 2
        System.out.println("Divisão: " + divisao);

        // Módulo (resto da divisão)
        int modulo = a % b; // 10 % 5 = 0 (resto da divisão)
        System.out.println("Módulo: " + modulo);
    }
}
