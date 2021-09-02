package br.edu.univas.vo;

public class Bulbs extends ChristmasTreeDecorator {

	public Bulbs() {
		super();
	}
	
	public Bulbs(ChristmasTree christmasTree) {
		super(christmasTree);
	}
	
	@Override
	public String decorate() {
		return " with Bubble Lights " + anotherDecorate();
	}
}
