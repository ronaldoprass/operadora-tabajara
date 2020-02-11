package br.com.tabajaradigital.faturamento;

import br.com.tabajaradigital.negocio.Cliente;
import br.com.tabajaradigital.negocio.Operadora;
import br.com.tabajaradigital.telefonia.PlanoPosPago;

public class BoletoPosPago extends Boleto {

	private PlanoPosPago plano;

	public BoletoPosPago(Cliente cliente, Operadora operadora, PlanoPosPago plano) {
		super(cliente,operadora);
		this.plano = plano;
	}


	@Override
	public  double calculaCobranca(double servicoUtilizado) {
		double valorCobranca = 0.0;
		if (servicoUtilizado <= plano.getFranquiaMinuto()) {

			valorCobranca = plano.getValorPlano();
			
		} else {

			valorCobranca = plano.getValorPlano() + calculaAdicional(servicoUtilizado);
		}
		return valorCobranca;
	}
	


	@Override
	public  double calculaAdicional(double servicoExcedido) {

		double valorAdicional = 0.0;
		if (servicoExcedido > plano.getFranquiaMinuto()) {

			valorAdicional = plano.getMinutoAdicional() * (servicoExcedido - plano.getFranquiaMinuto());
		}
		return valorAdicional;
	}

}
