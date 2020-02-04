package br.com.tabajaradigital.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.tabajaradigital.negocio.Cliente;

public class ClienteTest {

	int codigoCliente = 1;
	int NumeroCliente = 74521;
	Cliente cliente;
	
	@Before
	public void setup() {
		
		/* Montagem do cenário */
		
		
		//cliente = new Cliente(1,"Ronaldo Prass",74521);
		//Cliente c2 = new Cliente(2,"Ronaldo Arruda Prass",69874);
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testaCliente() {
		
		
		
		/* Execução dos testes */
		
		
		/* Verificações */
		
		assertThat(cliente.getCodigoCliente(), is(codigoCliente));
		assertThat(cliente.getNumeroCliente(), is(NumeroCliente));
		
		 
	}
	

	
}
