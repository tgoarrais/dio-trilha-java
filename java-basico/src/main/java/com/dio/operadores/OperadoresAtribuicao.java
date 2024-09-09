package com.dio.operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int a = 10;

        // Atribuição simples
        a = 20; // a agora vale 20
        System.out.println("Atribuição simples: " + a);

        // Atribuição com soma
        a += 5; // a agora vale 25 (20 + 5)
        System.out.println("Atribuição com soma: " + a);

        // Atribuição com subtração
        a -= 10; // a agora vale 15 (25 - 10)
        System.out.println("Atribuição com subtração: " + a);

        // Atribuição com multiplicação
        a *= 2; // a agora vale 30 (15 * 2)
        System.out.println("Atribuição com multiplicação: " + a);

        // Atribuição com divisão
        a /= 5; // a agora vale 6 (30 / 5)
        System.out.println("Atribuição com divisão: " + a);
    }
}
