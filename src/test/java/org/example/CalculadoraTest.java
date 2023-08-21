/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author ANDRES PORRAS
 */
public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Suma Basica")
    public void testSumaBasica() {
        double a = 5.0;
        double b = 3.0;
        
        double expResult = 8.0;
        double result = calculadora.suma(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    
    @DisplayName("Suma Negativos")
    public void testSumaNegativos() {
        double a = -5.0;
        double b = -3.0;
        double expResult = -8.0;
        double result = calculadora.suma(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    
    @DisplayName("Suma Positivos")
    public void testSumaPositivos() {
        double a = 5.0;
        double b = 3.0;
        double expResult = 8.0;
        double result = calculadora.suma(a, b);
        assertEquals(expResult, result, 0.0);
    }

    
}
