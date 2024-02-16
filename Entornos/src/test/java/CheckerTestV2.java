
import com.dam.entornos.Checker;
import org.junit.Test;
import static junit.framework.TestCase.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class CheckerTestV2 {

    @Test
    public void menosCero() throws Exception {
        Checker c = new Checker();
        assertFalse(c.check(-1));
    }

    @Test
    public void vaSerFalso() throws Exception {
        Checker c = new Checker();
        assertFalse(c.check(8));
        assertFalse(c.check(0));
    }

    @Test
    public void vaSerTrue() throws Exception {
        Checker c = new Checker();
        assertTrue(c.check(9));
        assertTrue(c.check(100));
        assertTrue(c.check(8));

    }
}
