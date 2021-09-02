package br.edu.univas.vo;

public abstract class ChristmasTreeDecorator implements ChristmasTree {

	private ChristmasTree christmasTree;
	
	public ChristmasTreeDecorator() {
		super();
	}
	
	public ChristmasTreeDecorator(ChristmasTree christmasTree) {
		this.christmasTree = christmasTree;
	}
	
	protected String anotherDecorate() {
		if (christmasTree == null) {
			return "";
		}
		return christmasTree.decorate();
	}
}
