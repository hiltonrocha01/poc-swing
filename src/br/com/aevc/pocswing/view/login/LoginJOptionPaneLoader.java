package br.com.aevc.pocswing.view.login;

import java.awt.Component;

import javax.swing.JOptionPane;

import br.com.aevc.pocswing.controller.ControllerResult;
import br.com.aevc.pocswing.controller.LoginController;
import br.com.aevc.pocswing.model.Usuario;

/**
 * @author alber
 *
 */
public class LoginJOptionPaneLoader {

	private static final AuthenticationFluxExecutor AUTHENTICATION_FLUX_EXECUTOR = new AuthenticationFluxExecutor();

	public static void showLoginDialog(Component component) {
		LoginFormJPanel loginFormJPanel = new LoginFormJPanel();

		int showConfirmDialog = JOptionPane.showConfirmDialog(component, loginFormJPanel, "Login",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		AUTHENTICATION_FLUX_EXECUTOR.executeAuthenticationFlux(component, showConfirmDialog,
				loginFormJPanel.getUsernameJTextField().getText(),
				new String(loginFormJPanel.getJPasswordField().getPassword()));

	}

}
