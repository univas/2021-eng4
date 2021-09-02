package br.edu.univas.vo;

public class Candy extends ChristmasTreeDecorator {

	public Candy() {
		super();
	}
	
	public Candy(ChristmasTree christmasTree) {
		super(christmasTree);
	}
	
	@Override
	public String decorate() {
		return " with Colored Candy " + anotherDecorate();
	}
}
