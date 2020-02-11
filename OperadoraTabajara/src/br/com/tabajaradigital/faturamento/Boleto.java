package br.com.tabajaradigital.faturamento;

import br.com.tabajaradigital.cobranca.Cobranca;
import br.com.tabajaradigital.negocio.Cliente;
import br.com.tabajaradigital.negocio.Operadora;

public abstract class Boleto implements Cobranca{

	private Cliente cliente;
	private Operadora operadora;
	private double valor;

	public Boleto() {
	}

	public Boleto(Cliente cliente, Operadora operadora) {
		super();
		this.cliente = cliente;
		this.operadora = operadora;
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Boleto [cliente=" + cliente + ", operadora=" + operadora + ", valor=" + valor + "]";
	}
	
	

}
