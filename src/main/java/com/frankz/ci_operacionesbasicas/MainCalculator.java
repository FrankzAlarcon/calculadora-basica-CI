/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frankz.ci_operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author Frankz
 */
public class MainCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Calculator calculadora =  new Calculator();
        boolean ejecutarApp = true;
        int opcion;
        while (ejecutarApp) {
            System.out.println("------------ CALCULADORA ------------");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.println("5.- Salir");
            System.out.println("Seleccione una opcion:");
            opcion = Integer.parseInt(sc.nextLine());
            int numero1;
            int numero2;            
            switch (opcion) {
                case 1:
                    System.out.println("------ SUMA ------");
                    System.out.println("Ingrese el numero 1: ");
                    numero1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el numero 2: ");
                    numero2 = Integer.parseInt(sc.nextLine());
                    System.out.println("El resultado es: " + calculadora.suma(numero1, numero2));
                    break;
                case 2:
                    System.out.println("------ RESTA ------");
                    System.out.println("Ingrese el numero 1: ");
                    numero1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el numero 2: ");
                    numero2 = Integer.parseInt(sc.nextLine());
                    System.out.println("El resultado es: " + calculadora.resta(numero1, numero2));                    
                    break;
                case 3:
                    System.out.println("------ MULTIPLICACION ------");
                    System.out.println("Ingrese el numero 1: ");
                    numero1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el numero 2: ");
                    numero2 = Integer.parseInt(sc.nextLine());
                    System.out.println("El resultado es: " + calculadora.multiplicacion(numero1, numero2));                      
                    break;
                case 4:
                    System.out.println("------ DIVISION ------");
                    System.out.println("Ingrese el numero 1: ");
                    numero1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el numero 2: ");
                    numero2 = Integer.parseInt(sc.nextLine());
                    System.out.println("El resultado es: " + calculadora.division(numero1, numero2));                      
                    break;
                default:
                    ejecutarApp = false;
                    break;
            }
        }
    }
    
}
