package br.com.tabajaradigital.test;

import br.com.tabajaradigital.faturamento.BoletoCombo;
import br.com.tabajaradigital.faturamento.BoletoPosPago;
import br.com.tabajaradigital.internet.PlanoInternet;
import br.com.tabajaradigital.negocio.Cliente;
import br.com.tabajaradigital.negocio.Operadora;
import br.com.tabajaradigital.negocio.StatusCliente;
import br.com.tabajaradigital.telefonia.PlanoPosPago;

public class TesteBoleto {

	public static void main(String[] args) {
		//Plano
		int codigoPlano = 100;
		String descricaoPlano = "Tabajara Plus";
		double valorPlano = 120.0; 
		double franquiaMinuto = 100.0;
		double minutoAdicional = 0.08;
		
		//Cliente
		int codigoCliente = 666;
		String nomeCliente = "Ariovaldo Antunes";
		String numeroCliente = "982067212";
		StatusCliente statusCliente = StatusCliente.ATIVO;
		
		//Operadora
		int codigoOperadora = 15;
		String nomeOperadora = "Tabajara";
		double servicoUtilizado = 250.0;
		
		
		//Plano Internet
		int codigoPlanoInternet = 15;
		String descricaoPlanoInternet = "Tabajara Plus";
		double valorPlanoInternet = 120.0; 
		String velocidade = "5G";
		int franquiaDado = 5000;//5 GB  
		double dadoAdicional = 0.09;
		
		//Criar objetos
		
		//Criação do objeto Cliente
		Cliente cliente = new Cliente(codigoCliente, nomeCliente, numeroCliente, statusCliente);
		
		//Criação do objeto Operadora
		Operadora operadora = new Operadora(codigoOperadora, nomeOperadora);
		
		//Criação do objeto PlanoInternet
		PlanoInternet planoInternet = new PlanoInternet(codigoPlanoInternet, 
				descricaoPlanoInternet,valorPlanoInternet, velocidade, franquiaDado, dadoAdicional);
		
		//Criação do objeto PlanoPosPago
		PlanoPosPago plano = new PlanoPosPago(codigoPlano, descricaoPlano, 
				valorPlano, franquiaMinuto, minutoAdicional);
		
		//Criação do objeto BoletoPosPago
		BoletoPosPago telefone = new BoletoPosPago(cliente, operadora, plano);
		
		double valorTelefone = telefone.calculaCobranca(servicoUtilizado);
		
		telefone.setValor(valorTelefone);
		
		
		
		//Criação do objeto BoletoCombo
		BoletoCombo boleto = new BoletoCombo(cliente, operadora, plano, planoInternet);
	    double dadosUtilizados = 6000;
	    
	    double valorInternet = boleto.calculaCobranca(dadosUtilizados);
	    
	    double totalFatura = valorTelefone + valorInternet;
		
	    boleto.setValorTotal(totalFatura);
		
		System.out.println(boleto);
		
		
		
		
		
    }

}
