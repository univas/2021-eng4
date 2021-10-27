package br.edu.univas.main;

import br.edu.univas.vo.Customer;

public class Prototype {

	public static void main(String[] args) {
		Customer customer = new Customer(
				"João", "123.123.123-11", 
				"Rua X, n 1 Bairro Y", 
				1234432);
		
		Customer customer2 = (Customer) customer.clone();
		customer2.setName("Maria");
		customer2.setCpf("333.333.333-33");
	}
}
