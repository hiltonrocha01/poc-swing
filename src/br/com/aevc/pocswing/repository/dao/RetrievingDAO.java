package br.com.aevc.pocswing.repository.dao;

import java.sql.SQLException;

public interface RetrievingDAO<T> extends DAOI<T> {

	T select(String query, DAOMapper<T> daoMapper) throws SQLException;

}
