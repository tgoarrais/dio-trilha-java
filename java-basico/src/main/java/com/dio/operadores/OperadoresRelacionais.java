package com.dio.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Igualdade
        boolean ehIgual = a == b; // false, porque 10 não é igual a 5
        System.out.println("É igual? " + ehIgual);

        // Diferença
        boolean ehDiferente = a != b; // true, porque 10 é diferente de 5
        System.out.println("É diferente? " + ehDiferente);

        // Maior que
        boolean maiorQue = a > b; // true, porque 10 é maior que 5
        System.out.println("Maior que? " + maiorQue);

        // Menor que
        boolean menorQue = a < b; // false, porque 10 não é menor que 5
        System.out.println("Menor que? " + menorQue);

        // Maior ou igual
        boolean maiorOuIgual = a >= b; // true, porque 10 é maior ou igual a 5
        System.out.println("Maior ou igual? " + maiorOuIgual);

        // Menor ou igual
        boolean menorOuIgual = a <= b; // false, porque 10 não é menor ou igual a 5
        System.out.println("Menor ou igual? " + menorOuIgual);
    }
}
