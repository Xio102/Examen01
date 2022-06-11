package com.pregunta3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner radio = new Scanner(System.in);

        int Radio;

        System.out.println("Ingrese el radio del circulo: ");
        Radio = radio.nextInt();

        double Area = Math.PI * Math.pow(Radio, 2) ;
        System.out.println("El área del circulo es: " + Area);
    }
}
