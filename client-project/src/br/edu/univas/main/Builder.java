package br.edu.univas.main;

import br.edu.univas.vo.BankAccount;

public class Builder {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount.Builder()
				.withOwner("João")
				.withAccountNumber("1234")
				.withBranch("9876")
				.withBalance(23.00)
				.withInterestRate(1.5)
				.build();
		
		System.out.println("Conta: " + account1);
	}
}
