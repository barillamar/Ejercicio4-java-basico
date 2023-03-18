package com.ejercicios.poo;

public class SmartDevice {

    // Atributos

    protected String marca;
    protected String color;
    protected String modelo;

    // Constructores

    public SmartDevice() { // contructor vacio

    }
    // constructor con parámetros

    public SmartDevice(String marca, String color, String modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

}
