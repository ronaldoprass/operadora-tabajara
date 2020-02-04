package br.com.tabajaradigital.cobranca;

/**
 *
 * @author ronaldo prass
 */
public interface Cobranca {

    public double calculaCobranca(double servicoUtilizado);
    
    public double calculaAdicional(double servicoExcedido);
    

}
