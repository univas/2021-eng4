package br.edu.univas.vo;

public abstract class ImpostoDecorator implements Imposto {

	private Imposto imposto;
	
	public ImpostoDecorator() {
		super();
	}
	
	public ImpostoDecorator(Imposto imposto) {
		this.imposto = imposto;
	}
	
	protected double calcAnotherTax(Orcamento orcamento) {
		if (imposto == null) {
			return 0.0;
		}
		return imposto.calcTax(orcamento);
	}
}
