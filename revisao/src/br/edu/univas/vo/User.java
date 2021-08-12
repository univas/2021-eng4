package br.edu.univas.vo;

import java.io.Serializable;

public class User implements Login, XPTO {

	private String userName;
	private String password;

	public String getLogin() {
		return userName;
	}

	public void setLogin(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean authentication() {
		return userName.equals("admin") &&
				password.equals("admin");
	}

	@Override
	public void doSomething() {
		System.out.println("Fazendo alguma coisa!!!");
	}
	
}
