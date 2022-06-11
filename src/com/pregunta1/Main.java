package com.pregunta1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);

        String nombre;
        String habilidad;

        System.out.println("Introduzca su nombre: ");
        nombre=teclado.nextLine();

        System.out.println("Ingrese su habilidad: ");
        habilidad=teclado.nextLine();

        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su habilidad es: "+habilidad);

    }
}
