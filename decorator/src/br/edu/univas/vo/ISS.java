package br.edu.univas.vo;

public class ISS extends ImpostoDecorator {

	public ISS() {
		super();
	}
	
	public ISS(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcTax(Orcamento orcamento) {
		return orcamento.getValue() * 0.10 + calcAnotherTax(orcamento);
	}

}
