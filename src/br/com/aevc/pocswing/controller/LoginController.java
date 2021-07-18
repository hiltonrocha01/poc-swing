package br.com.aevc.pocswing.controller;

/**
 * @author alber
 *
 */
public class LoginController {

	public ControllerResult<Boolean> doLogin(String usuario, String senha) {
		System.out.println(usuario);
		System.out.println(senha);
		return new ControllerResult<Boolean>(false, String.format("Usuário %s autenticado com sucesso:", usuario));
	}

}
