package br.com.aevc.pocswing.view.login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginFormJPanel extends JPanel{

	private static final long serialVersionUID = 9031784451368701659L;
	
	private JTextField username;
	private JPasswordField password;
	
	public LoginFormJPanel() {
		super();
		
		JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
	    label.add(new JLabel("Usuário:", SwingConstants.RIGHT));
	    label.add(new JLabel("Senha:", SwingConstants.RIGHT));
	    add(label, BorderLayout.WEST);

	    JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
	    
	    this.username = new JTextField();
	    this.username.setPreferredSize(new Dimension(100,20));
	    controls.add(username);
	    
	    this.password = new JPasswordField();
	    this.password.setPreferredSize(new Dimension(100,20));
	    controls.add(password);
	    
	    add(controls, BorderLayout.CENTER);
	}

	public JTextField getUsername() {
		return username;
	}

	public JPasswordField getPassword() {
		return password;
	}
	
}
