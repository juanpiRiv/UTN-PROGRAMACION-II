package org.example.Modulo1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Hola! Vamos a hacer algunas operaciones matemáticas");

        System.out.print("Dame el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ahora dame el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("\n¡Perfecto! Con " + numero1 + " y " + numero2 + " puedo hacer esto:");
        System.out.println("─────────────────────────────────────");

        // Las operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;

        System.out.println("Si los sumo: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Si los resto: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Si los multiplico: " + numero1 + " x " + numero2 + " = " + multiplicacion);

        // División
        if (numero2 == 0) {
            System.out.println("Para la división... ¡Ups! No puedo dividir por cero ");
        } else {
            double division = (double) numero1 / numero2;
            System.out.println("Si los divido: " + numero1 + " ÷ " + numero2 + " = " + division);
        }

        scanner.close();
    }
}