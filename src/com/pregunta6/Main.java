package com.pregunta6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        System.out.println("Ingrese un numero: ");
        Scanner valor1= new Scanner(System.in);
        int numero1=valor1.nextInt();

        System.out.println("Ingrese segundo numero: ");
        Scanner valor2 = new Scanner(System.in);
        int numero2=valor2.nextInt();

        int multiplicacion = numero1 * numero2;

        int num1 = numero1;
        int num2 = numero2;

        System.out.println("El resultado es: "+multiplicacion);
    }
}
