package br.edu.univas.vo;

public class IPI extends ImpostoDecorator {

	public IPI() {
		super();
	}
	
	public IPI(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcTax(Orcamento orcamento) {
		return orcamento.getValue() * 0.15 + calcAnotherTax(orcamento);
	}

}
