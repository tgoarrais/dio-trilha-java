package com.dio.tipos;

/* Em Java, os tipos de dados são categorizados em dois grupos principais:
Tipos primitivos
Tipos de referência */

/*1. Tipos Primitivos

Os tipos primitivos são os tipos de dados mais básicos e não são objetos. Java possui oito tipos primitivos */

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipo byte - armazena números inteiros de -128 a 127
        byte idade = 30;

        // Tipo short - armazena números inteiros de -32.768 a 32.767
        short salarioMensal = 20000;

        // Tipo int - armazena números inteiros de -2^31 a 2^31-1
        int populacaoCidade = 500000;

        // Tipo long - armazena números inteiros de -2^63 a 2^63-1
        long distanciaEstrelas = 123456789L; // O 'L' no final indica que é um tipo long

        // Tipo float - armazena números de ponto flutuante com precisão simples
        float peso = 65.5f; // O 'f' no final indica que é um tipo float

        // Tipo double - armazena números de ponto flutuante com precisão dupla
        double altura = 1.75;

        // Tipo char - armazena um único caractere Unicode
        char inicialDoNome = 'A';

        // Tipo boolean - armazena verdadeiro ou falso
        boolean estaChovendo = false;

        // Imprimindo os valores
        System.out.println("Idade: " + idade);
        System.out.println("Salário Mensal: " + salarioMensal);
        System.out.println("População da Cidade: " + populacaoCidade);
        System.out.println("Distância até as estrelas: " + distanciaEstrelas + " km");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Inicial do Nome: " + inicialDoNome);
        System.out.println("Está chovendo? " + estaChovendo);
    }
}
