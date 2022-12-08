/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frankz.ci_operacionesbasicas;

/**
 *
 * @author Frankz
 */
public class Calculator {
    public int suma(int a, int b) {
        return a + b;
    }
    
    public int resta(int a, int b) {
        return a - b;
    }
    
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    
    public int division(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir para cero");
            return 0;
        }
        return a / b;
    }
}
