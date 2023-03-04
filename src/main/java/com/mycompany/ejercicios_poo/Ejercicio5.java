/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_poo;
import java.util.Scanner;


public class Ejercicio5 {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Ingrese el radio del circulo: ");
      double radio = input.nextDouble();
      
      double area = Math.PI * Math.pow(radio, 2);
      double longitud = 2 * Math.PI * radio;
      
      System.out.println("El area del circulo es: " + area);
      System.out.println("La longitud de la circunferencia es: " + longitud);
   }
}

