package com.dio.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 5;

        // Operador de incremento
        a++; // a agora é 6
        System.out.println("Incremento: " + a);

        // Operador de decremento
        a--; // a agora é 5 novamente
        System.out.println("Decremento: " + a);

        // Negativo
        int negativo = -a; // a variável negativa será -5
        System.out.println("Negativo: " + negativo);
    }
}
