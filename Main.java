package com.ejercicios.poo;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto a partir del constructor vacio
        SmartDevice xiaomi = new SmartDevice();

        // Crear un objeto a partir del constructor con parámetros

        SmartPhone smartPhone = new SmartPhone("Samsung", "Azul", "S21", 16.0, "Android");
        SmartWatch smartWatch = new SmartWatch("Apple", "Negro", "SE", true, 1.5);

        // Imprimir valores smartphone
        System.out.println("El smartphone es: \n");
        System.out.println("Marca: " + smartPhone.marca + "\nColor: " + smartPhone.color + "\nModelo: " + smartPhone.modelo);
        System.out.println("Almacenamiento: " + smartPhone.almacenamiento + "\nSistema Operativo: " + smartPhone.sistemaOperativo);

        // Imprimir valores smartwatch
        System.out.println("\nEl smartwatch es: \n");
        System.out.println("Marca: " + smartWatch.marca + "\nColor: " + smartWatch.color + "\nModelo: " + smartWatch.modelo);
        System.out.println("Notificaciones: " + smartWatch.notificaciones + "\nPulgadas: " + smartWatch.pulgadas);
    }
}