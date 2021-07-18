package br.com.aevc.pocswing.view.menu;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * @author alber
 *
 */
class FileJMenu extends JMenu {

	private static final long serialVersionUID = -4757532708335874622L;

	public FileJMenu() {
		super("Arquivo");
		add(new JMenuItem("Configuração",
				new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/gear.png")))));
		addSeparator();

		JMenuItem sairJMenuItem = new JMenuItem("Sair");
		sairJMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(sairJMenuItem);
	}

}
