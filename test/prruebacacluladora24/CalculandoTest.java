/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prruebacacluladora24;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author usuario
 */
@RunWith(Parameterized.class)
public class CalculandoTest {
    static private Calculando calculadora;
    
    private double numero1;
    private double numero2;
    private double resultado;
    private double error;
    
    public CalculandoTest() {
    }

    public CalculandoTest(double numero1, double numero2, double resultado, double error) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
        this.error = error;
    }
   
    @Parameters
    public static Collection<Object[]> numeros(){
        return Arrays.asList(new Object[][]{
            {-1,1,0},{1000,1000,2000},{0,0,0},{33,21,56}
        });
    }

    
    
    @BeforeClass
    public static void creaCalculadora() {
        calculadora = new Calculando();
    }
    
    @AfterClass
    public static void eliminaCalculadora() {
        calculadora=null;
    }

    /**
     * Test of add method, of class Calculando.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double number1 = 0.0;
        double number2 = 0.0;
        //Calculando calculadora = new Calculando();
        double expResult = 0.0;
        double result = calculadora.add(number1, number2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Calculando.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 0.0;
        double number2 = 0.0;
       // Calculando calculadora = new Calculando();
        double expResult = 0.0;
        double result = calculadora.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculando.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 0.0;
        double number2 = 0.0;
        //Calculando calculadora = new Calculando();
        double expResult = 0.0;
        double result = calculadora.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculando.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double number1 = 0.0;
        double number2 = 0.0;
        
        double expResult = 0.0;
        try {
            double result = calculadora.divide(number1, number2);
            assertEquals(expResult, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
            fail("Deber?a lanzar el error 'divide by cero'");
          } catch (Exception e) {
               System.out.println("Capturo divide by cero-> "+e.getMessage());
        }
    }
    
}
