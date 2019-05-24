package com.system.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	/**
	 * 
	 * Gera um hash utilizando BCrypt
	 * 
	 * @param senha
	 * @return password.encode
	 */
	public static String gerarBCrypt(String senha) {
		if(senha==null) {
			return senha;
		}
		
		BCryptPasswordEncoder password = new BCryptPasswordEncoder();
		return password.encode(senha);
	}
	
	/**
	 * 
	 * Verifica se a senha é válida.
	 * 
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean
	 */
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder password = new BCryptPasswordEncoder();
		return password.matches(senha, senhaEncoded);
	}
}
