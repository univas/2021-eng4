package br.edu.univas.main;

import br.edu.univas.vo.ICMS;
import br.edu.univas.vo.IPI;
import br.edu.univas.vo.ISS;
import br.edu.univas.vo.ImpostoDecorator;
import br.edu.univas.vo.Orcamento;

public class Decorator {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(150);
		
//		Imposto ipi = new IPI();
//		double ipiTax = ipi.calcTax(orcamento);
//		System.out.println("Valor do IPI: " + ipiTax);
//		
//		Imposto icms = new ICMS();
//		double icmsTax = icms.calcTax(orcamento);
//		System.out.println("Valor do ICMS: " + icmsTax);
//		
//		Imposto iss = new ISS();
//		double issTax = iss.calcTax(orcamento);
//		System.out.println("Valor do ISS: " + issTax);
//		
//		System.out.println("Valor total: " + (ipiTax + icmsTax + issTax));	
		
		ImpostoDecorator imposto = new IPI(new ICMS(new ISS()));
		double total = imposto.calcTax(orcamento);
		System.out.println("Valor total: " + total);
		
		ImpostoDecorator imposto2 = new ISS(new IPI());
		double issWithIPITax = imposto2.calcTax(orcamento);
		System.out.println("Valor do ISS + IPI: " + issWithIPITax);
	}
}
