package br.edu.univas.vo;

public abstract class Animal {
	
	private String raca;
	private int peso;
	
	public abstract void dormir();
	
	public void comer() {
		System.out.println("Comendo...");
	}
	
	public void correr() {
		System.out.println("Correndo...");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
