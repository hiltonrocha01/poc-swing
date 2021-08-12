package br.com.aevc.pocswing.repository.dao;

import java.sql.SQLException;

public interface ModificationDAO<T> extends RetrievingDAO<T>{

	void insert(T t) throws SQLException;

	void delete(T t) throws SQLException;

	void update(T t) throws SQLException;

}
