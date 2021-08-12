package br.com.aevc.pocswing.view;

import javax.swing.JFrame;

/**
 * @author alber
 *
 */
public class ViewLoader {

	private static JFrame mainView;

	public static void load() {
		if (mainView == null) {
			mainView = new MainView("Main Panel");
			mainView.add(new MainPanel());
			mainView.validate();
		}

	}

	public static JFrame getMainView() {
		return mainView;
	}

}
