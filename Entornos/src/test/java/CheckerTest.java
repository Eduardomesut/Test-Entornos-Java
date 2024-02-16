
import com.dam.entornos.*;
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
public class CheckerTest {

    @Test
    public void eresStreamer() {
        Checker c = new Checker();
       // assertEquals("Eres streamer", c.check(5, "LMDShow"));
        
    }
    @Test
    public void eresDiCaprio() {
        Checker c = new Checker();
        //assertEquals("Ve a un psicologo", c.check(19, "Leonardo DiCaprio"));
        //assertEquals("Ve a un psicologo", c.check(25, "Leonardo DiCaprio"));
        
    }
    @Test
    public void noEstasEnfermo() {
        Checker c = new Checker();
        //assertEquals("Query Ok", c.check(29, "Normal"));
        
    }
}
