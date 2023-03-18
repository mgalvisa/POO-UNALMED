/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;
import java.util.Scanner;


public class Ejercicio_10_cap4 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Pedir los datos del estudiante
        System.out.print("Ingrese el número de inscripción: ");
        int numInscripcion = input.nextInt();
        
        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = input.nextLine(); // Se lee una línea vacía para limpiar el buffer
        nombres = input.nextLine();
        
        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = input.nextDouble();
        
        System.out.print("Ingrese el estrato social del estudiante: ");
        int estrato = input.nextInt();
        
        // Calcular el pago de matrícula
        double pagoMatricula = 50000; // Valor constante
        
        if (patrimonio > 2000000 && estrato > 3) {
            double incremento = patrimonio * 0.03;
            pagoMatricula += incremento;
        }
        
        // Mostrar los resultados
        System.out.println("El estudiante con numero de inscripcion " + numInscripcion +
                            " Y nombre " + nombres + " debe pagar $" + pagoMatricula);

    }
}

