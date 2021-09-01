package br.edu.univas.vo;

public class ICMS extends ImpostoDecorator {

	public ICMS() {
		super();
	}
	
	public ICMS(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcTax(Orcamento orcamento) {
		return orcamento.getValue() * 0.18 + calcAnotherTax(orcamento);
	}

}
