package RepositorioClases.JUnit.Ejemplo;

import Ejemplo.Operacion;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class OperacionTest {

    private int a;
    private int b;

    @Before
    public void setUp() throws Exception {
        a = 4;
        b = 2;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testDivisionAssert() {
        int resultado = Ejemplo.Operacion.division(a,b);
        assertEquals(2, resultado, 0.0);
    }

    @Test
    public void testDivisionTryCatch() {
        b = 0;
        try {
            int resultado = Ejemplo.Operacion.division(a,b);
            fail();
        } catch (ArithmeticException e) {
            /* Si hay una excepción, salta a esta línea evitando llegar al fail() */
        }
    }

    @Test (expected = ArithmeticException.class)
    public void testDivisionExpected() {
        b = 0;
        int resultado = Operacion.division(a,b);
    }

}
