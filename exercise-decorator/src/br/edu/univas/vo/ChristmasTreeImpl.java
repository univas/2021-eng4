package br.edu.univas.vo;

public class ChristmasTreeImpl extends ChristmasTreeDecorator {

	public ChristmasTreeImpl() {
		super();
	}
	
	public ChristmasTreeImpl(ChristmasTree christmasTree) {
		super(christmasTree);
	}
	
	@Override
	public String decorate() {
		return "Christmas tree " + anotherDecorate();
	}
}
