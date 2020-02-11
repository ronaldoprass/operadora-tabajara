package br.com.tabajaradigital.faturamento;

import br.com.tabajaradigital.internet.PlanoInternet;
import br.com.tabajaradigital.negocio.Cliente;
import br.com.tabajaradigital.negocio.Operadora;
import br.com.tabajaradigital.telefonia.PlanoPosPago;

public class BoletoCombo extends BoletoPosPago{

	private PlanoInternet planoInternet;
	private double valorTotal;
	
	public BoletoCombo(Cliente cliente, Operadora operadora, PlanoPosPago plano, PlanoInternet planoInternet) {
		super(cliente, operadora, plano);
		this.planoInternet = planoInternet;
	}

	public PlanoInternet getPlanoInternet() {
		return planoInternet;
	}

	public void setPlanoInternet(PlanoInternet planoInternet) {
		this.planoInternet = planoInternet;
	}

	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public  double calculaCobranca(double servicoUtilizado) {
		double valorCobranca = 0.0;
		if (servicoUtilizado <= planoInternet.getFranquiaDado()) {

			valorCobranca = planoInternet.getValorPlano();
			
		} else {

			valorCobranca = planoInternet.getValorPlano() + calculaAdicional(servicoUtilizado);
		}
		return valorCobranca;
	}
	


	@Override
	public  double calculaAdicional(double servicoExcedido) {

		double valorAdicional = 0.0;
		if (servicoExcedido > planoInternet.getFranquiaDado()) {
			planoInternet.getFranquiaDado();
			valorAdicional = planoInternet.getValorPlano() * planoInternet.getDadoAdicional();
		}
		return valorAdicional;
	}


	@Override
	public String toString() {
		return "BoletoCombo [planoInternet=" + planoInternet + ", valorTotal=" + valorTotal + "]";
	}

	

}
