package br.com.aevc.pocswing.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

/**
 * @author alber
 *
 */
class MainView extends JFrame {

	private static final long serialVersionUID = 8688799300953604464L;

	public MainView(String string) {
		super(string);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			setSize(1024, 650);
	        setMinimumSize(new Dimension(800, 600));
	        setLocation(150, 50);
			setIconImage(
					Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/cube_molecule_view.png")));
			setTitle("Registro de Compra");
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//			pack();
			setVisible(true);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.print("Impossible do start application because: ");
			e.printStackTrace();
		}

	}

}
