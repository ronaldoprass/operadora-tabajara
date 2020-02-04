package br.com.tabajaradigital.faturamento;

import br.com.tabajaradigital.cobranca.Cobranca;
import br.com.tabajaradigital.negocio.Cliente;
import br.com.tabajaradigital.negocio.Operadora;

public abstract class Boleto implements Cobranca {

	private Cliente cliente;
	private Operadora operadora;
	private double valor;

	public Boleto() {
	}

	public Boleto(Cliente cliente, Operadora operadora, double valor) {
		super();
		this.cliente = cliente;
		this.operadora = operadora;
		this.valor = valor;
	}

	private Cliente getCliente() {
		return cliente;
	}

	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private Operadora getOperadora() {
		return operadora;
	}

	private void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	private double getValor() {
		return valor;
	}

	private void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
