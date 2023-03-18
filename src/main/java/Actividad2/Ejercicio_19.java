/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;
import java.util.Scanner;

public class Ejercicio_19 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = input.nextDouble();
        
        double perimetro = 3 * lado;
        double altura = (Math.sqrt(3) / 2) * lado;
        double area = (Math.sqrt(3) / 4) * lado * lado;
        
        System.out.println("\nPerímetro del triángulo: " + perimetro);
        System.out.println("Altura del triángulo: " + altura);
        System.out.println("Área del triángulo: " + area);
    }

}
