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

    //----------------------MULTIPLICACION Y DIVISION----------------------------------

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Iniciando todas las pruebas de Calculadora.");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("Finalizando todas las pruebas de Calculadora.");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Iniciando prueba.");
        instance = new Calculadora();
        assertNotNull(instance);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada.");
    }

    @Test
    public void testMultiplicacion() {
        assertAll(
            "Pruebas de multiplicación",
            () -> assertEquals(15.0, instance.multiplicacion(5.0, 3.0), 0.0),
            () -> assertEquals(-15.0, instance.multiplicacion(-5.0, 3.0), 0.0),
            () -> assertEquals(15.0, instance.multiplicacion(-5.0, -3.0), 0.0),
            () -> assertEquals(15.0, instance.multiplicacion(5.0, 3.0), 0.0),
            () -> assertEquals(0.0, instance.multiplicacion(5.0, 0.0), 0.0)
        );
    }

    @Test
    public void testDivision() {
        assertAll(
            "Pruebas de división",
            () -> assertEquals(2.0, instance.division(6.0, 3.0), 0.0),
            () -> assertThrows(IllegalArgumentException.class, () -> instance.division(6.0, 0.0)),
            () -> assertEquals(-2.0, instance.division(-6.0, 3.0), 0.0)
        );
    }
    //--------------------------------------------------------
}
