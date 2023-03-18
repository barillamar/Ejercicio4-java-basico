package com.ejercicios.poo;

public class SmartPhone extends SmartDevice{

    double almacenamiento;
    String sistemaOperativo;

    public SmartPhone() {

    }

    public SmartPhone(String marca, String color, String modelo, double almacenamiento, String sistemaOperativo) {
        super(marca, color, modelo);
        this.almacenamiento = almacenamiento;
        this.sistemaOperativo = sistemaOperativo;
    }
}
