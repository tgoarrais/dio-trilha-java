package com.dio.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public int trocarCanal(int canal) {
        return this.canal = canal;
    }

    public int aumentarVolume() {
        return volume++;
    }

    public int dominuirVolume() {
        return volume--;
    }
}
