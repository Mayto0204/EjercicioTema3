package com.virtuallife;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche(2);

        System.out.println("El coche tiene " + coche.nPuertas + " puertas.");

        coche.setnPuertas(coche.nPuertas + 1);

        System.out.println("Ahora el coche tiene " + coche.nPuertas + " puertas.");
    }
}