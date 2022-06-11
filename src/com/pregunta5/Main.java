package com.pregunta5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingresa un número: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print("Es numero par.");
        } else {
            System.out.print("Es numero impar. ");
        }
    }
}
