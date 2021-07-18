package br.com.aevc.pocswing.view.login;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.aevc.pocswing.controller.ControllerResult;
import br.com.aevc.pocswing.controller.LoginController;

/**
 * @author alber
 *
 */
public class LoginJPanel extends JPanel {

	private static final long serialVersionUID = -1641867850638045129L;

	private final LoginController loginController = new LoginController();

	private LoginFormJPanel loginFormJPanel;

	public LoginJPanel() {
		super();
		this.loginFormJPanel = new LoginFormJPanel();
		setBorder(BorderFactory.createEtchedBorder());
		
		int showConfirmDialog = JOptionPane.showConfirmDialog(null, this.loginFormJPanel, "Login",
				JOptionPane.OK_CANCEL_OPTION);
		if (showConfirmDialog == JOptionPane.OK_OPTION) {
			
			ControllerResult<Boolean> doLogin = this.loginController.doLogin(
					this.loginFormJPanel.getUsername().getText(),
					new String(this.loginFormJPanel.getPassword().getPassword()));
			
			if (!doLogin.getResult()) {
				JOptionPane.showMessageDialog(null, doLogin.getMessage());
			}else {
				JOptionPane.showMessageDialog(null, doLogin.getMessage());
			}
			
		} else {
			System.exit(0);
		}
		

	}

}
