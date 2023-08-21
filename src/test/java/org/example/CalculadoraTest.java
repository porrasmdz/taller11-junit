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

    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada.");
    }

    @Test
    public void testMultiplicacion() {
        assertAll(
            "Pruebas de multiplicación",
            () -> assertEquals(15.0, calculadora.multiplicacion(5.0, 3.0), 0.0),
            () -> assertEquals(-15.0, calculadora.multiplicacion(-5.0, 3.0), 0.0),
            () -> assertEquals(15.0, calculadora.multiplicacion(-5.0, -3.0), 0.0),
            () -> assertEquals(15.0, calculadora.multiplicacion(5.0, 3.0), 0.0),
            () -> assertEquals(0.0, calculadora.multiplicacion(5.0, 0.0), 0.0)
        );
    }

    @Test
    public void testDivision() {
        assertAll(
            "Pruebas de división",
            () -> assertEquals(2.0, calculadora.division(6.0, 3.0), 0.0),
            () -> assertThrows(IllegalArgumentException.class, () -> calculadora.division(6.0, 0.0)),
            () -> assertEquals(-2.0, calculadora.division(-6.0, 3.0), 0.0)
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

    @Test
    @DisplayName("Exponenciación: Potencia positiva")
    public void testExponenciacionPotenciaPositiva() {
        double result = calculadora.exponenciacion(2, 1);
        
        assertEquals(2, result, 0);
        
        fail("No es igual a 2 el resultado.");
    }
    
    @Test
    @DisplayName("Exponenciación: Potencia con base negativa y exponente par")
    public void testExponenciacionPotenciaBaseNegativa() {
        double result = calculadora.exponenciacion(-2, 1);
        
        assertTrue(result == 4.0, "El resultado no es igual a 4.0.");
    }
    
    @Test
    @DisplayName("Exponenciación: Potencia con base negativa y exponente impar")
    public void testExponenciacionPotenciaNegativaBaseImpar() {
        double result = calculadora.exponenciacion(-2, 3); // Exponente impar
        
        assertNotNull(result, "El resultado no debería ser nulo.");
    }
    
    @Test
    @DisplayName("Exponenciación: Potencia con exponente 0")
    public void testExponenciacionPotenciaExponenteCero() {
        double result = calculadora.exponenciacion(2, 0); // Exponente 0
        
        assertTrue(result == 1.0, "El resultado debería ser 1.0.");
    }

    /**
     * Test of radicacion method, of class Calculadora.
     */
    
    
    
    //----------------------Radicacion----------------------------------
    
     @BeforeAll
    public static void setUpClass() {
        System.out.println("Antes de las pruebas");
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

    
    
    
}
