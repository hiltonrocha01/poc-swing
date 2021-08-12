package br.com.aevc.pocswing.view.login;

import java.awt.Component;

import javax.swing.JOptionPane;

import br.com.aevc.pocswing.controller.ControllerResult;
import br.com.aevc.pocswing.controller.LoginController;

public class AuthenticationFluxExecutor {

	private static final LoginController LOGIN_CONTROLLER = LoginController.getInstance();

	public void executeAuthenticationFlux(Component component, int dialogResult, String username,
			String password) {
		if (dialogResult == JOptionPane.OK_OPTION) {
			ControllerResult<Boolean> doLogin = LOGIN_CONTROLLER.doLogin(username, password);
			JOptionPane.showMessageDialog(component, doLogin.getMessage());
			if (!doLogin.getResult()) {
				executeAuthenticationFlux(component, dialogResult, username, password);
			}
		} else {
			System.exit(0);
		}
	}

}
