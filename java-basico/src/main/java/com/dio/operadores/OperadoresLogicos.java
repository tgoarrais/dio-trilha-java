package com.dio.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;

        // Operador lógico E (&&) - retorna verdadeiro apenas se ambos forem verdadeiros
        boolean resultadoE = verdadeiro && falso; // false, porque um dos dois é falso
        System.out.println("Resultado do E (&&): " + resultadoE);

        // Operador lógico OU (||) - retorna verdadeiro se um dos dois for verdadeiro
        boolean resultadoOU = verdadeiro || falso; // true, porque um dos dois é verdadeiro
        System.out.println("Resultado do OU (||): " + resultadoOU);

        // Operador lógico NÃO (!) - inverte o valor booleano
        boolean resultadoNao = !verdadeiro; // false, porque inverte o verdadeiro
        System.out.println("Resultado do NÃO (!): " + resultadoNao);
    }
}
