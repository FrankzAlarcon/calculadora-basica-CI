/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frankz.ci_operacionesbasicas;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Frankz
 */
@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    
    private int a, b, expected;
    
    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        ArrayList<Object[]> objects = new ArrayList<Object[]>();
        //parametros (a,b,expected)
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{1,8,9});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{7,3,10});
        objects.add(new Object[]{22,4,26});
        objects.add(new Object[]{12,14,26});
        return objects;
    }
    
    @Test
    public void given_dos_enteros_when_suma_then_ok() {
        System.out.println("Test 1");
        Calculator c = new Calculator();        
        int actual = c.suma(a,b);        
        assertEquals(expected, actual);        
    }
}

