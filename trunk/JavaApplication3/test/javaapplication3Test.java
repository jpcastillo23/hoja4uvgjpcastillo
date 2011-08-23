/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * @AUTHOR JOSE PABLO CASTILLO RODAS
 * 
 * 
 * TEST DE MI CLASE MAIN
 */


import javaapplcation3.javaapplication3;
import javaapplcation3.SinglyLinked;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JayPiCastillo
 */
public class javaapplication3Test {
    
    public javaapplication3Test() {
    }

    public void testIngre() {
        System.out.println("Ingre");
        String msg = "PRESIONE LA TECLA 3";
        String err = "NO ESTA EN EL RANGO";
        int inf = 0;
        int sup = 1;
        double expResult = 3;
        System.out.println("FAVOR PRESIONE 3");
        double result = javaapplication3.Ingre(msg, err, inf, sup);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calc method, of class javaapplication3.
     */
    @Test
    public void testCalc() {
        System.out.println("calc");
        double uno = 2.0;
        SinglyLinked hola = new SinglyLinked();
        hola.push(uno);
        double dos = 4.0;
        double choice = 1; //suma
        double expResult = 6.0;
        double result = javaapplication3.calc(uno, dos, choice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
}
