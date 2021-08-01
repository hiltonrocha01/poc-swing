package br.com.aevc.pocswing.view.login;

import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.aevc.pocswing.controller.ControllerResult;
import br.com.aevc.pocswing.controller.LoginController;

/**
 * @author alber
 *
 */
public class LoginJOptionPaneLoader {

	private static final LoginController LOGIN_CONTROLLER = LoginController.getInstance();

	public static void showLoginDialog(Component component) {
		LoginFormJPanel loginFormJPanel = new LoginFormJPanel();
		
		JPanel jPanel = new JPanel();

		int showConfirmDialog = JOptionPane.showConfirmDialog(component, loginFormJPanel, "Login",
				JOptionPane.OK_CANCEL_OPTION);

		if (showConfirmDialog == JOptionPane.OK_OPTION) {
			ControllerResult<Boolean> doLogin = LOGIN_CONTROLLER.doLogin(
					loginFormJPanel.getUsernameJTextField().getText(),
					new String(loginFormJPanel.getjPasswordField().getPassword()));
			JOptionPane.showMessageDialog(component, doLogin.getMessage());
			if(!doLogin.getResult()) {
				showLoginDialog(component);
			}
		} else {
			System.exit(0);
		}

	}

}
