package br.com.aevc.pocswing.view.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * @author alber
 *
 */
class HelpJMenu extends JMenu {

	private static final long serialVersionUID = -4757532708335874622L;

	public HelpJMenu() {
		super("Ajuda");
		add(new JMenuItem("Sobre"));
	}

}
