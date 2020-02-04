package br.com.tabajaradigital.test;

import java.sql.SQLException;

import br.com.tabajaradigital.util.ConnectionFactory;

public class TesteDAO {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(ConnectionFactory.getConnection().isClosed());
		
		

	}

}
