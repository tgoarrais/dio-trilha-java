package com.dio.metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? : " + smartTv.ligada);
        System.out.println("Canal atual? : " + smartTv.canal);
        System.out.println("Qual o volume? : " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.trocarCanal(5);

        System.out.println("TV ligada? : " + smartTv.ligada);
        System.out.println("Canal atual? : " + smartTv.canal);
        System.out.println("Qual o volume? : " + smartTv.volume);
    }

}
