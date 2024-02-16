
import com.dam.entornos.Calculadora;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class CalculadoraTest {
    @Test
    public void sumaEnterosTest(){
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.sumar(1, 1));
    }
    @Test
    public void sumaNegativosTest(){
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.sumar(1, -2));
    }
    @Test
    public void sumaLetrasTest(){
        Calculadora calc = new Calculadora();
        assertEquals((int)'a', calc.sumar(0, 1));
    }
    
    @Test(expected = NullPointerException.class)
    public void sumaNullTest(){
        Calculadora calc = new Calculadora();
        calc.sumar(null, null);
    }
}
