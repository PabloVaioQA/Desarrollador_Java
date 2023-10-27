
package tp5_carritodecompras;

import Entidades.Carrito;
import Entidades.Descuento;
import Entidades.DescuentoFijo;
import Entidades.DescuentoPorcentaje;
import Entidades.DescuentoPorcentajeConTope;
import Entidades.ItemCarrito;
import Entidades.Producto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaiop
 */
public class TP5_CarritoDeCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1-
        // Primera prueba de funcionamiento del codigo
        
        /*
        Producto producto1 = new Producto(40, "Jabon en polvo");
        Producto producto2 = new Producto(10, "Esponja");
        Producto producto3 = new Producto(100, "Chocolate");
        
        ItemCarrito item1 = new ItemCarrito(1, producto1);
        ItemCarrito item2 = new ItemCarrito(3, producto2);
        ItemCarrito item3 = new ItemCarrito(2, producto3);
        
        ItemCarrito[] items = {item1,item2,item3};
        
        Carrito carrito = new Carrito();
        carrito.setItems(items);
        carrito.precioCarrito();
        
        System.out.println("Lista de productos creados: ");
        carrito.mostrarLista(items);
        System.out.println("------------");
        System.out.println("Precio total de mi Carrito: $ " + carrito.precio());
        */
        
        // 2-
        // Primera prueba de funcionamiento del codigo
        
        String ListaCarrito = "C:\\Users\\vaiop\\OneDrive\\Documentos\\Pato\\UTN-Neoris\\Tp2\\Git-Pablo\\Desarrollador_Java\\TP5_CarritoDeCompras\\recursos\\ListaCarrito.txt";
        List<ItemCarrito> itemsCarrito = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ListaCarrito))) {
            String line;
            while ((line = br.readLine()) != null) {
                
                String[] values = line.split(",");
                int cant = Integer.parseInt(values[0].trim());
                int precioUnitario = Integer.parseInt(values[1].trim());
                String nombre = values[2].trim();
                Producto producto = new Producto(precioUnitario, nombre);
                ItemCarrito item = new ItemCarrito(cant, producto);
                itemsCarrito.add(item);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Cant | PrecioUnitario | Producto");
        
        for (ItemCarrito itemCarrito : itemsCarrito) {
            System.out.println(itemCarrito.getCantidad()+ "      " + itemCarrito.getProducto().getPrecio() +"         "+ itemCarrito.getProducto().getNombre());
        }
        
        
        
        Carrito carrito = new Carrito(0, itemsCarrito);
        System.out.println("El precio total del carrito es: " + carrito.precioCarrito());
        
        
        
        
        
        
        
        
        Descuento desc1 = new DescuentoFijo();
        desc1.setValordesc((float) 14.0);
        System.out.println(desc1.valorFinal(100)); // 86
        //-----------------------------
        Descuento desc2 = new DescuentoPorcentaje();
        desc2.setValordesc((float) 0.3);
        System.out.println(desc2.valorFinal(100)); // 70
        //-----------------------------
        Descuento desc3 = new DescuentoPorcentajeConTope();
        desc3.setValordesc((float) 0.3);
        System.out.println(desc3.valorFinal(100)); // 70
        System.out.println(desc3.valorFinal(200)); // 160 Solo decuenta 40
    }
    
}
    
    

