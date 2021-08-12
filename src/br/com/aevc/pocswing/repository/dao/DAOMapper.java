package br.com.aevc.pocswing.repository.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DAOMapper<T> {

	public abstract T map(ResultSet resultSet) throws SQLException;

}
