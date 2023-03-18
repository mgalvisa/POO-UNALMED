/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;
import java.util.Scanner;


public class Ejercicio_21 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del primer lado: ");
        double lado1 = input.nextDouble();
        
        System.out.print("Ingrese el valor del segundo lado: ");
        double lado2 = input.nextDouble();
        
        System.out.print("Ingrese el valor del tercer lado: ");
        double lado3 = input.nextDouble();
        
        double perimetro = lado1 + lado2 + lado3;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        
        System.out.println("\nPerímetro del triángulo: " + perimetro);
        System.out.println("Semiperímetro del triángulo: " + semiperimetro);
        System.out.println("Área del triángulo: " + area);
    }
}
