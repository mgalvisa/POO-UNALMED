/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_poo;


public class Ejercicio3 {
    
      public static void main(String[] args) {
        int horasTrabajadas = 48;
        int valorHora = 5000;
        double porcentajeRetencion = 0.125;

        int salarioBruto = horasTrabajadas * valorHora;
        double retencionFuente = salarioBruto * porcentajeRetencion;
        int salarioNeto = (int) (salarioBruto - retencionFuente);

        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retención en la fuente: $" + retencionFuente);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}
