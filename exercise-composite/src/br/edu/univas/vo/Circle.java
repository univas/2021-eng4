package br.edu.univas.vo;

public class Circle implements Component {

	@Override
	public void draw() {
		System.out.println("  ***");
		System.out.println(" *   *");
		System.out.println("*     *");
		System.out.println(" *   *");
		System.out.println("  ***");
	}
}
