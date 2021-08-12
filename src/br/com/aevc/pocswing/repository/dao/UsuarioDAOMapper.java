package br.com.aevc.pocswing.repository.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.aevc.pocswing.model.Usuario;

public class UsuarioDAOMapper extends DAOMapper<Usuario> {

	@Override
	public Usuario map(ResultSet resultSet) throws SQLException {
		String nameDb = resultSet.getString("nome");
		String senhaDb = resultSet.getString("senha");
		Integer idadeDb = resultSet.getInt("idade");
		String matriculaDb = resultSet.getString("matricula");

		return new Usuario(nameDb, idadeDb, matriculaDb, senhaDb);
	}

}
