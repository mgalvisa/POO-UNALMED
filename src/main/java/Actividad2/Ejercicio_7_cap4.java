/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;
import java.util.Scanner;

public class Ejercicio_7_cap4 {
 
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de A: ");
        double A = input.nextDouble();
        
        System.out.print("Ingrese el valor de B: ");
        double B = input.nextDouble();
        
        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A < B) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual a B");
        }
    }
     
}
