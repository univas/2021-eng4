package br.edu.univas.vo;

public class Funcionario implements Login {

	@Override
	public boolean authentication() {
		return false;
	}

}
