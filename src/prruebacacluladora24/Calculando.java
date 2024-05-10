/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prruebacacluladora24;

/**
 *
 * @author usuario
 */
public class Calculando {

    public double add(double number1, double number2){
    return number1 + number2; 
    } 
    
    public double subtract(double number1, double number2){ 
    return number1 - number2; 
    } 
    
    public double multiply(double number1, double number2) { 
    return number1 * number2; 
    } 

    public double divide(double number1, double number2){
        if(number2==0)
            throw new ArithmeticException("divisi?n por cero");
    return number1 / number2; 
}




}
