package Entidades;

import java.time.LocalDate;


/**
 *
 * @author vaiop
 */
public abstract class Descuento {
    
    private float valor;
    
    public float getValorDesc(){
        return valor;
    }

    public void setValordesc(float valor){
    this.valor = valor;
    
    }
    
    public abstract float valorFinal(float valorInicial);
}
