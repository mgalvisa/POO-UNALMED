/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;
import java.util.Scanner;

public class Ejercicio_18 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el codigo del empleado: ");
        int id_empleado = input.nextInt();

        input.nextLine();

        System.out.print("Ingrese los nombres del empleado: ");
        String nombres = input.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas al mes: ");
        int horasTrabajadas = input.nextInt();

        System.out.print("Ingrese el valor hora trabajada: ");
        double valorHora = input.nextDouble();

        System.out.print("Ingrese el porcentaje de retencion en la fuente: ");
        double porcentajeRetencion = input.nextDouble();
        
        double salarioBruto = horasTrabajadas * valorHora;
        double retencionFuente = salarioBruto * (porcentajeRetencion / 100);
        double salarioNeto = salarioBruto - retencionFuente;
        
        System.out.println("codigo del empleado: " + id_empleado);
        System.out.println("Nombres del empleado: " + nombres);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Salario neto: " + salarioNeto);
    
       
     }
     }

