package br.com.aevc.pocswing.view.user;

import br.com.aevc.pocswing.controller.ControllerResult;
import br.com.aevc.pocswing.controller.RegisterController;
import br.com.aevc.pocswing.model.Usuario;
import javax.swing.*;

/**
 * @author Natanael
 */
public class UserRegistrationJPanel extends JPanel {

	private static final long serialVersionUID = -1941098188860327226L;
	private Usuario user;

	public UserRegistrationJPanel() {
		super();

		boolean isToContinueLoop = true;

		UserRegistrationFormJPanel userRegisterForm;
		setBorder(BorderFactory.createEmptyBorder());

		while (isToContinueLoop) {
			userRegisterForm = new UserRegistrationFormJPanel(user);
			int confirmDialogOption = JOptionPane.showInternalConfirmDialog(null, userRegisterForm, "Cadastro",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

			if (confirmDialogOption == JOptionPane.OK_OPTION) {
				user = userRegisterForm.getUser();
				RegisterController registerController = RegisterController.getInstance();
				ControllerResult<Boolean> result = registerController.doRegister(user);

				if (result.getResult()) {
					JOptionPane.showMessageDialog(this, result.getMessage(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					isToContinueLoop = false;

				} else {
					JOptionPane.showMessageDialog(null, result.getMessage(), "Falha ao resigtrar usuário", JOptionPane.ERROR_MESSAGE);
				}

			} else if (confirmDialogOption == JOptionPane.CANCEL_OPTION || confirmDialogOption == JOptionPane.CLOSED_OPTION) {
				isToContinueLoop = false;
			}
		}
	}
}
