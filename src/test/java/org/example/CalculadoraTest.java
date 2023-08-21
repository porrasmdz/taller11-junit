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
    public void setUp() {
        calculadora = new Calculadora();
        assertNotNull(calculadora);
    }
    
    
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
    @DisplayName("Suma Basica")
    public void testSumaBasica() {
        double a = 5.0;
        double b = 3.0;
        
        double expResult = 8.0;
        double result = calculadora.suma(a, b);
        assertEquals(expResult, result);
    }
    @Test
    @DisplayName("Suma Negativos")
    public void testSumaNegativos() {
        double a = -5.0;
        double b = -3.0;
        double expResult = -8.0;
        double result = calculadora.suma(a, b);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Suma Positivos")
    public void testSumaPositivos() {
        double a = 5.0;
        double b = 3.0;
        double expResult = 8.0;
        double result = calculadora.suma(a, b);
        assertAll("result",
                ()-> assertEquals(expResult, result),
                ()-> assertTrue(result > 0));
    }

      
  @Test
    @DisplayName("Resta Basica")
    public void testRestaBasica() {
        double a = 5.0;
        double b = 1.0;
        
        double expResult = 4.0;
        double result = calculadora.resta(a, b);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Resta Negativos")
    public void testRestaNegativos() {
        double a = -5.0;
        double b = -3.0;
        double expResult = -2.0;
        double result = calculadora.resta(a, b);
        assertAll("result",
                ()-> assertEquals(expResult, result),
                ()-> assertTrue(result > a),
                ()-> assertNotNull(result));
    }

    @Test
    
    @DisplayName("Resta Positivos")
    public void testRestaPositivos() {
        double a = 5.0;
        double b = 3.0;
        double expResult = 2.0;
        double result = calculadora.resta(a, b);
        assertAll("result",
                ()-> assertEquals(expResult, result),
                ()-> assertTrue(result < a),
                ()-> assertNotNull(result));
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

    
  

    //----------------------MULTIPLICACION Y DIVISION----------------------------------


}
