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
public class CalculatorExecute {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("== Calculator Execute ==");
        Calculator c = new Calculator();
        int addition = c.suma(4, 7);
        System.out.println("c.suma(4, 7) =  " + addition);
        
        int subtraction = c.resta(4, 7);
        System.out.println("c.resta(4, 7) =  " + subtraction);
    }    
}
