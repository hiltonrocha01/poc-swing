package br.com.aevc.pocswing.controller;

import br.com.aevc.pocswing.model.Usuario;
import br.com.aevc.pocswing.repository.dao.DAO;
import br.com.aevc.pocswing.repository.dao.UserDAO;
import br.com.aevc.pocswing.repository.db.H2DatabaseConnectionManager;

import java.sql.Connection;

import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;
import org.h2.jdbc.JdbcSQLNonTransientConnectionException;

/**
 * @author Natanael
 *
 */
public class RegisterController {

	private static final RegisterController INSTANCE = new RegisterController();
	
	private DAO dao;

	public RegisterController() {
	}

	public ControllerResult<Boolean> doRegister(Usuario user) {
		if (user == null) {
			return new ControllerResult<>(false, "Nome do usuário não pode estar vazio");
		} else {

			try {
				Connection connection = H2DatabaseConnectionManager.getConnection("sa");
				
				dao = new UserDAO(connection, H2DatabaseConnectionManager.TABLE_NAME);
				dao.insert(user);
				
				return new ControllerResult<Boolean>(true,
						String.format("Usuário %s cadastrado com sucesso.", user.getNome()));

			} catch (JdbcSQLNonTransientConnectionException e) {
				return new ControllerResult<Boolean>(false, "Falha de conexão com o banco de dados");

			} catch (JdbcSQLIntegrityConstraintViolationException e) {
				return new ControllerResult<Boolean>(false, String.format("Usuário %s já existe.", user.getNome()));

			} catch (Exception e) {
				e.printStackTrace();
				return new ControllerResult<Boolean>(false, String.format("Erro desconhecido: %s", e.getMessage()));
			}
		}
	}

	public static RegisterController getInstance() {
		return INSTANCE;
	}
}
