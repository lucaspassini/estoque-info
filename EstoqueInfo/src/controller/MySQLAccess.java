package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLAccess {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	final private String host = "localhost";
	final private String user = "root";
	final private String passwd = "";

	public void readDataBase() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");

			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "/estoqueinfo?" + "user=" + user + "&password=" + passwd);

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from estoque");
			writeResultSet(resultSet);
			
			System.out.println("Banco de Dados Conectado com sucesso!");

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	
	private void writeResultSet(ResultSet resultSet) throws SQLException {

		while (resultSet.next()) {

			int codProduto = resultSet.getInt("codProduto");
			double saldoProduto = resultSet.getDouble("saldoProduto");

			System.out.println("Codigo do Produto: " + codProduto);
			System.out.println("Saldo: " + saldoProduto);

		}
	}
	
	// You need to close the resultSet
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

}

