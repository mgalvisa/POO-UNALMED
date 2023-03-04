/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_poo;
import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = input.nextInt();
            
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            
            System.out.println("El cuadrado de " + numero + " es " + cuadrado);
            System.out.println("El cubo de " + numero + " es " + cubo);
        }
    }
}

