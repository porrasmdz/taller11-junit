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

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma_double_double() {
        System.out.println("suma");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta_double_double() {
        System.out.println("resta");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion_double_double() {
        System.out.println("multiplicacion");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision_double_double() {
        System.out.println("division");
        double dividendo = 0.0;
        double divisor = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division(dividendo, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exponenciacion method, of class Calculadora.
     */
    @Test
    public void testExponenciacion_double_double() {
        System.out.println("exponenciacion");
        double base = 0.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    @DisplayName("Exponenciación: Potencia positiva")
    public void testExponenciacionPotenciaPositiva() {
        
        
        Calculadora calculadora = new Calculadora();
        
        double result = calculadora.exponenciacion(2, 1);
        
        assertEquals(2, result, 0);
        
        fail("No es igual a 2 el resultado.");
    }

    /**
     * Test of radicacion method, of class Calculadora.
     */
    
    
    
    //----------------------Radicacion----------------------------------
    
     @BeforeAll
    public static void setUpClass() {
        System.out.println("Antes de las pruebas");
    }

    @BeforeEach
    public void setUp() {
        instance = new Calculadora();
        System.out.println("Antes de cada prueba");
    }

    @AfterEach
    public void tearDown() {
        instance = null;
        System.out.println("Después de cada prueba");
    }

    @Test
    public void testRadicacionNumeroPositivo() {
        double numero = 4.0;
        double indice = 2.0;
        double expResult = 2.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testRadicacionNumeroNegativo() {
        double numero = -4.0;
        double indice = 2.0;
        assertThrows(IllegalArgumentException.class, () -> instance.radicacion(numero, indice));
    }

    @Test
    public void testRadicacionEnesima() {
        double numero = 8.0;
        double indice = 3.0;
        double expResult = 2.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0.0);
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Después de las pruebas");
    }
    
    @Test
    public void testRadicacion_double_double() {
        System.out.println("radicacion");
        double numero = 0.0;
        double indice = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of radicacion method, of class Calculadora.
     */
    @Test
    public void testRadicacion() {
        System.out.println("radicacion");
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.radicacion();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    
>>>>>>> 87d2e682566ccad9f7b02f2cb7813d462d6b0f47
}
