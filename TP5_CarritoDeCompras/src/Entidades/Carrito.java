package Entidades;

import java.util.List;

/**
 *
 * @author vaiop
 */
public class Carrito {
    
    private int fecha;
    private List<ItemCarrito> lista;

    public Carrito() {
    }

    public Carrito(int fecha, List<ItemCarrito> lista) {
        this.fecha = fecha;
        this.lista = lista;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public List<ItemCarrito> getLista() {
        return lista;
    }

    public void setLista(List<ItemCarrito> lista) {
        this.lista = lista;
    }

  
    //Calculo de precio total del carrito
    
   public int precioCarrito(){
   
       int precioTotalCarrito = 0;
       
       for (ItemCarrito item : lista) {
           
           precioTotalCarrito += item.Precio();
                   
       }
       return precioTotalCarrito;
   } 
   
   public void mostrarLista(ItemCarrito[] items){
       for (ItemCarrito item : items) {
           System.out.println(item.getProducto().toString() + "Cantidad :" + item.getCantidad());
           
       }
    }
   
   
    @Override
    public String toString() {
        return "Carrito{" + "fecha=" + fecha + ", items=" + lista + '}' ;
    }
   
   


}


