package br.com.tabajaradigital.internet;

import br.com.tabajaradigital.negocio.Plano;
import br.com.tabajaradigital.cobranca.Cobranca;

/**
 *
 * @author ronaldo
 */
public class PlanoInternet extends Plano {

    private String velocidade;
    private int franquiaDado;
    private double dadoAdicional;

    public PlanoInternet(int codigoPlano, String descricaoPlano, 
    		double valorPlano, String velocidade, 
    		int franquiaDado, double dadoAdicional) {
        super(codigoPlano, descricaoPlano, valorPlano);
        this.velocidade = velocidade;
        this.franquiaDado = franquiaDado;
        this.dadoAdicional = dadoAdicional;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public int getFranquiaDado() {
        return franquiaDado;
    }

    public void setFranquiaDado(int franquiaDado) {
        this.franquiaDado = franquiaDado;
    }

    public double getDadoAdicional() {
        return dadoAdicional;
    }

    public void setDadoAdicional(double dadoAdicional) {
        this.dadoAdicional = dadoAdicional;
    }

	

	@Override
	public String toString() {
		return "PlanoInternet [velocidade=" + velocidade + ", franquiaDado=" + franquiaDado + ", dadoAdicional="
				+ dadoAdicional + "]";
	}

    
}
