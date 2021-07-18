package br.com.aevc.pocswing.view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import br.com.aevc.pocswing.view.login.LoginJPanel;
import br.com.aevc.pocswing.view.menu.TopJMenuBar;

/**
 * @author alber
 *
 */
class MainPanel extends JPanel {

	private static final long serialVersionUID = 4626916175436479200L;

	public MainPanel() {
		super(new BorderLayout());
		add(new TopJMenuBar(), BorderLayout.PAGE_START);
		add(new LoginJPanel());
		setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	}
}
