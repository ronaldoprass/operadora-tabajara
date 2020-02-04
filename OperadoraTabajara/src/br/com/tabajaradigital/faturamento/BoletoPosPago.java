package br.com.tabajaradigital.faturamento;

import br.com.tabajaradigital.telefonia.PlanoPosPago;

public  class BoletoPosPago extends Boleto {

	public BoletoPosPago(PlanoPosPago plano) {
		super();
		this.plano = plano;
	}

	private PlanoPosPago plano;

	private PlanoPosPago getPlano() {
		return plano;
	}

	private void setPlano(PlanoPosPago plano) {
		this.plano = plano;
	}

	@Override
	public final double calculaCobranca(double servicoUtilizado) {
		double valorCobranca = 0.0;
		if (servicoUtilizado <= plano.getFranquiaMinuto()) {

			valorCobranca = plano.getValorPlano();
			
		} else {

			valorCobranca = plano.getValorPlano() + calculaAdicional(servicoUtilizado);
		}
		return valorCobranca;
	}
	


	@Override
	public final double calculaAdicional(double servicoExcedido) {

		double valorAdicional = 0.0;
		if (servicoExcedido > plano.getFranquiaMinuto()) {

			valorAdicional = plano.getMinutoAdicional() * (servicoExcedido - plano.getFranquiaMinuto());
		}
		return valorAdicional;
	}

}
