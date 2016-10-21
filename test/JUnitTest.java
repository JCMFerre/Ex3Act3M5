/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ex3_act3_m5.Utils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reskitow
 */
public class JUnitTest {

    public JUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private Utils ut = new Utils();

    @Test
    public void calcularMatriculaCorrecte() {
        assertEquals(ut.calcularMatricula("5"), 150);
    }

    @Test
    public void calcularMatriculaMaxim() {
        assertFalse(ut.calcularMatricula("18") != 380);
    }

    @Test
    public void calcularMatriculaError() {
        assertTrue(ut.calcularMatricula("1001") == -6000);
    }
}
