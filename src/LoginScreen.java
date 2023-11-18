// Classe para autenticação de usuários.

import java.util.HashMap;
import java.util.Map;

public class LoginScreen {	
	private Map<String, String> userDatabase;

	 // Constrói uma nova instância de LoginScreen e inicializa a base de dados dos usuários.
	 
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("Zaga", "PalmeirasSemMundial");
		userDatabase.put("Lugano", "securepass");		// Tentativa de autenticação (Usuário e Senha)
	}
	
	 // @param username O nome do usuário que está tentando logar.
	 // @param password A senha inserida pelo usuário.
	 // @return {@code true} se a autenticação for aceita, {@code false} caso não.
	 
	public boolean login(String username, String password) {
		
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if(storedPassword.equals(password)) {
				return true; // Autenticação bem sucedida.
			}
		}
		return false; // Autenticação falha.
	}
	
	/**
	 * Adiciona um novo usuário à base de dados de usuários. Por favor note que esse método não é
	 * recomendado para ser utilizado em ambiente de produção, uma vez que não dispõe de medidas
	 * de segurança adequadas.
	 * 
	 * @param username O nome do novo usuário.
	 * @param password A senha do novo usuário.
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);	
	}
	
}