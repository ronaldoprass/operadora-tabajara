package br.com.tabajaradigital.internet;

import br.com.tabajaradigital.negocio.Plano;

/**
 *
 * @author ronaldo
 */
public class PlanoInternet extends Plano {

    private int velocidade;
    private int franquiaDado;
    private double dadoAdicional;

    public PlanoInternet(int codigoPlano, String descricaoPlano, double valorPlano, int velocidade, int franquiaDado, double dadoAdicional) {
        super(codigoPlano, descricaoPlano, valorPlano);
        this.velocidade = velocidade;
        this.franquiaDado = franquiaDado;
        this.dadoAdicional = dadoAdicional;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(dadoAdicional);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + franquiaDado;
		result = prime * result + velocidade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanoInternet other = (PlanoInternet) obj;
		if (Double.doubleToLongBits(dadoAdicional) != Double.doubleToLongBits(other.dadoAdicional))
			return false;
		if (franquiaDado != other.franquiaDado)
			return false;
		if (velocidade != other.velocidade)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlanoInternet [velocidade=" + velocidade + ", franquiaDado=" + franquiaDado + ", dadoAdicional="
				+ dadoAdicional + "]";
	}

    
}
