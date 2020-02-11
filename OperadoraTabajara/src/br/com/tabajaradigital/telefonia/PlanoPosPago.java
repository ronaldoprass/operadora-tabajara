package br.com.tabajaradigital.telefonia;

/**
 *
 * @author ronaldo
 */
public class PlanoPosPago extends PlanoTelefonia{

    private double minutoAdicional;
 

    public PlanoPosPago(int codigoPlano, String descricaoPlano, 
    		double valorPlano, double franquiaMinuto, double minutoAdicional) {
        super(codigoPlano, descricaoPlano, valorPlano, franquiaMinuto);
        this.minutoAdicional = minutoAdicional;
    }

    public double getMinutoAdicional() {
        return minutoAdicional;
    }

    public void setMinutoAdicional(double minutoAdicional) {
        this.minutoAdicional = minutoAdicional;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(minutoAdicional);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		PlanoPosPago other = (PlanoPosPago) obj;
		if (Double.doubleToLongBits(minutoAdicional) != Double.doubleToLongBits(other.minutoAdicional))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlanoPosPago [minutoAdicional=" + minutoAdicional + "]";
	}

    
}
