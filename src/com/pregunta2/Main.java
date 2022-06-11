package com.pregunta2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int x;

            System.out.print("Ingresa numero. ");
            x = sc.nextInt();
            System.out.print("Valor al cuadrado: " + Math.pow(x, 2));
    }
}
