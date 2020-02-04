package br.com.tabajaradigital.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author Ronaldo Prass
 */
public class ConnectionFactory {

	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static String JDBC_URL = "jdbc:mysql://localhost/treinamento";
	private static String JDBC_USER = "root";
	private static String JDBC_PASSWORD = "";

	
	
	 public static Connection getConnection() throws Exception {

	        try {
	            Class.forName(JDBC_DRIVER);
	            return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	        } catch (ClassNotFoundException e) {
	            throw new Exception("Driver JDBC não encontrado! ", e.getCause());
	        } catch (SQLException e) {
	            throw new Exception(
	                    "Erro(" + e.getSQLState() + ") na conexão com Banco de Dados! ",
	                    e.getCause());
	        }
	    }
	
	public static Connection getDataSource() throws Exception {

		InitialContext context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/MyLocalDB");

		try {

			return ds.getConnection();

		} catch (SQLException e) {

			throw new Exception(e.getMessage());
		}
	}

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
		close(conn, stmt, rs);
	}

	public static void closeConnection(Connection conn, Statement stmt) throws SQLException {
		close(conn, stmt, null);
	}

	public static void closeConnection(Connection conn) throws SQLException {
		close(conn, null, null);
	}

	private static void close(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			throw new SQLException(e.getMessage());
		}
	}
}