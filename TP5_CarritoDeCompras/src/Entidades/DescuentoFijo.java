package Entidades;

/**
 *
 * @author vaiop
 */
public class DescuentoFijo extends Descuento {
    
    
   @Override 
   public float valorFinal(float valorInicial){
       return valorInicial - this.getValorDesc();
   }
    

}
