package Entidades;

/**
 *
 * @author vaiop
 */
public class DescuentoPorcentajeConTope extends Descuento{
    
    @Override
    public float valorFinal(float valorInicial) {
        
        float descuento = valorInicial -(valorInicial * this.getValorDesc());
        
        if((valorInicial - descuento) > 40){
            return valorInicial - 40;
        }else{
            return descuento;
        }
        
    }
}
