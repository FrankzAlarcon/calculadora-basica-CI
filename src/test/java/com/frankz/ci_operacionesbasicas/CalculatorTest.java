/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frankz.ci_operacionesbasicas;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Frankz
 */
public class CalculatorTest {
    Calculator calculadora;
    
    @Before
    public void setUp() {
        System.out.println("Setup");
        calculadora = new Calculator();
    }

    @Test
    public void given_dos_numeros_when_suma_then_ok() {
        System.out.println("Test 1");
        assertEquals(40, calculadora.suma(12, 28));
    }

    @Test
    public void given_dos_numeros_when_resta_then_ok() {
        System.out.println("Test 2");
        assertEquals(-16, calculadora.resta(12, 28));
    }

    @Test
    public void given_dos_numeros_when_multiplicacion_then_ok() {
        System.out.println("Test 3");
        assertEquals(32, calculadora.multiplicacion(4, 8));        
    }

    @Test
    public void given_dos_numeros_when_division_then_ok() {
        System.out.println("Test 4");
        assertEquals(5, calculadora.division(100, 20));        
    }
    
}
