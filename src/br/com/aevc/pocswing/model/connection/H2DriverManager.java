package br.com.aevc.pocswing.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H2DriverManager {

	private static final String H2_CONNECTION_URL = "jdbc:h2:~/poc-swing";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(H2_CONNECTION_URL, "sa", "");
	}

	public static void main(String[] args) throws SQLException {
		
		Connection connection = H2DriverManager.getConnection();
		//sampleDDL(connection);
		sampleDML(connection);
	}

	public static void sampleDML(Connection connection) {
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT nome FROM usuario");

			// or alternatively, if you don't know ahead of time that
			// the query will be a SELECT...

			if (stmt.execute("SELECT nome FROM usuario")) {
				rs = stmt.getResultSet();
			}
			String nome = rs.getString("nome");
			
			
			// Now do something with the ResultSet ....
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt = null;
			}
		}
	}

	public static void sampleDDL(Connection connection) throws SQLException {
		String dropSql = "DROP TABLE bar";

		Statement stmt = connection.createStatement();

		// Execute the query
		stmt.executeUpdate(dropSql);
	}

}
