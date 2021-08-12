package br.edu.univas.vo;

public class Cachorro extends Canino {

	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Cachorro dormindo...");
	}

}
