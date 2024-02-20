
import com.mycompany.entornostestingjunit.GestorPalabras;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class GestorPalabrasTest {

    @Test(expected = NullPointerException.class)
    public void comprobarPalindromo() {
        GestorPalabras g = new GestorPalabras();
        assertTrue(g.esPalindromo("OsO"));
        assertTrue(g.esPalindromo("ána"));
        assertFalse(g.esPalindromo("patatA"));
        assertTrue(g.esPalindromo(null));
        assertTrue(g.esPalindromo("allí ves sevilla"));
    }

    @Test
    public void comprobarContarVocales() {
        GestorPalabras g = new GestorPalabras();
        assertEquals(3, g.contarVocales("PeARTA"));
        assertEquals(6, g.contarVocales("LagartoAOU"));
        assertEquals(3, g.contarVocales("óolaww"));
        assertEquals(0, g.contarVocales("998"));
    }
    
    @Test
    public void comprobarPalabrasReves(){
        GestorPalabras g = new GestorPalabras();
        assertEquals("nomaj", g.invertirPalabra("jamon"));
        assertEquals("elPpa", g.invertirPalabra("apPle"));
        assertEquals("nótar", g.invertirPalabra("ratón"));
        assertEquals("9988", g.invertirPalabra("8899"));
    }
}
