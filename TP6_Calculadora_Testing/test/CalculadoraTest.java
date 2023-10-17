import Entidades.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vaiop
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
    
    //1. El resultado de multiplicar 80 por 3 da 240
    @Test
    public void MultiplicarTest(){
        Calculadora calc = new Calculadora();
        double unNumero = 80;
        double otroNumero = 3;
        double resultado = 240;
        
        assertEquals(resultado, calc.Multiplicacion(unNumero, otroNumero) , 0);
    }
    
    //2. El resultado de sumar 150 y 180, dividido por 3, da 110
    @Test
    public void SumaryDividirTest(){
        Calculadora calc = new Calculadora();
        double unNumero = 150;
        double otroNumero = 180;
        double num3 = 3;
        double resultado = 110;
        
        assertEquals(resultado, calc.Division(calc.Suma(unNumero, otroNumero), num3) , 0);
        assertEquals()
    }
    //3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
    @Test
    public void RestaryMultiplicarTest(){
        Calculadora calc = new Calculadora();
        double unNumero = 90;
        double otroNumero = 50;
        double num3 = 15;
        double resultado = 600;
        
        assertNotEquals(resultado, calc.Multiplicacion(calc.Resta(unNumero, otroNumero), num3) , 0);
    }
    //4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
    @Test
    public void SumaryMultiplicarTest(){
        Calculadora calc = new Calculadora();
        double unNumero = 70;
        double otroNumero = 40;
        double num3 = 25;
        double resultado = 2700;
        
        assertNotEquals(resultado, calc.Multiplicacion(calc.Suma(unNumero, otroNumero), num3) , 0);
    }
}
