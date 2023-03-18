package com.ejercicios.poo;

public class SmartWatch extends SmartDevice{

    boolean notificaciones;
    double pulgadas;

    public SmartWatch() {

    }

    public SmartWatch(String marca, String color, String modelo, boolean notificaciones, double pulgadas) {
        super(marca, color, modelo);
        this.notificaciones = notificaciones;
        this.pulgadas = pulgadas;
    }
}
