package br.com.aevc.pocswing.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author alber
 *
 */
public class LoginController {

	public ControllerResult<Boolean> doLogin(String usuario, String senha) {

		System.out.println(usuario);
		System.out.println(senha);

		File file = new File("C:\\Users\\alber\\aevc\\usuarios\\albert.txt");
		try {
			String readString = Files.readString(file.toPath());
			if (senha.equals(readString)) {
				return new ControllerResult<Boolean>(true, String.format("Usuário %s autenticado.", usuario));
			} else {
				return new ControllerResult<Boolean>(false, String.format("Usuário %s senha incorreta.", usuario));
			}

		} catch (IOException e) {
			return new ControllerResult<Boolean>(false, String.format("Usuário %s não encontrado.", usuario));
		}

	}

}
