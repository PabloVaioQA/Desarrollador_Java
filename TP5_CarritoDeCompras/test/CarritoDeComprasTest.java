import Entidades.Carrito;
import Entidades.Descuento;
import Entidades.DescuentoFijo;
import Entidades.DescuentoPorcentaje;
import Entidades.DescuentoPorcentajeConTope;
import Entidades.ItemCarrito;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
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
public class CarritoDeComprasTest {
    
    public CarritoDeComprasTest() {
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

    // Test de PrecioCarrito
    @Test
    public void TestPrecio(){
        
        Producto producto1 = new Producto(40, "Jabon en polvo");
        Producto producto2 = new Producto(10, "Esponja");
        Producto producto3 = new Producto(100, "Chocolate");
        
        ItemCarrito item1 = new ItemCarrito(1, producto1);
        ItemCarrito item2 = new ItemCarrito(3, producto2);
        ItemCarrito item3 = new ItemCarrito(2, producto3);
        
        List<ItemCarrito> itemsCarrito = new ArrayList<>();
        itemsCarrito.add(item1);
        itemsCarrito.add(item2);
        itemsCarrito.add(item3);
        Carrito carrito = new Carrito(0, itemsCarrito);
        
        assertEquals(270, carrito.precioCarrito(), 0);
    }
    
    // Test de Descuento Fijo ($20)
    @Test
    public void TestDescuentoFijo(){
        
        Descuento desc1 = new DescuentoFijo();
        desc1.setValordesc((float) 20.0);
        
        assertEquals(80,desc1.valorFinal(100),0);
    
    }
    
    // Test de Descuento Porcentaje (25%)
    @Test
    public void TestDescuentoPorcentaje(){
        Descuento desc2 = new DescuentoPorcentaje();
        desc2.setValordesc((float) 0.25);
        
        assertEquals(75,desc2.valorFinal(100),0);
    
    }
    
    // Test de Descuento Porcentaje Con Tope (Descuento 20% - Tope: 40)
    @Test
    public void TestDescuentoPorcentajeConTope(){
        Descuento desc3 = new DescuentoPorcentajeConTope();
        desc3.setValordesc((float) 0.2);
        
        assertEquals(160,desc3.valorFinal(200),0); 
    }
    
    // Test de Descuento Porcentaje Con Tope 2( usando NotEquals)
    @Test
    public void TestDescuentoPorcentajeConTope2(){
        Descuento desc3 = new DescuentoPorcentajeConTope();
        desc3.setValordesc((float) 0.2);
        
        assertNotEquals(320,desc3.valorFinal(400),0);
    }
    
}
