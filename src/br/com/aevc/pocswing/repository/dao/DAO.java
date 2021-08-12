package br.com.aevc.pocswing.repository.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO<T> implements ModificationDAO<T> {

	protected final Connection connection;
	protected final String tableName;

	public DAO(Connection connection, String tableName) {
		this.connection = connection;
		this.tableName = tableName;

	}

	public abstract void insert(T t) throws SQLException;

	public abstract void delete(T t) throws SQLException;

	public abstract void update(T t) throws SQLException;

	public T select(String query, DAOMapper<T> daoMapper) throws SQLException {
		try (Statement statement = connection.createStatement()) {
			ResultSet resultSet = statement.executeQuery(query);

			if (resultSet.first()) {
				return daoMapper.map(resultSet);
			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
			System.out.println("VendorError: " + e.getCause());
		} finally {

			if (connection != null) {
				connection.close();
			}
		}
		return null;
	}

	/**
	 * Método responsável por executar de forma correta e centralizada os comandos
	 * SQL
	 *
	 */
	protected void executeStatement(String sqlCommand) throws SQLException {

		Statement statement = connection.createStatement();
		try {
			statement.execute(sqlCommand);
		} finally {
			if (connection != null) {
				connection.close();
				statement.close();
			}
		}

	}

}
