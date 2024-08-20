import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.example.Main;

public class MainTest {

    @Test
    public void ehParFalseTest(){
        Main m = new Main();
        assertFalse(m.ehPar(3));
    }
    
    @Test
    public void ehParTrueTest(){
        Main m = new Main();
        assertTrue(m.ehPar(2));
    }

    @Test
    public void somaTest(){
        Main m = new Main();
        int resultado = m.soma(2, 2);
        assertEquals(4, resultado);       
    }
    
    @Test
    public void imprimeTest(){
        Main m = new Main();
        String ret = m.imprime();
        assertEquals("Hello World", ret);
    }
    
}
