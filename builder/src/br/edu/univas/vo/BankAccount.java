package br.edu.univas.vo;

public class BankAccount {

	private String owner;
	private String accountNumber;
	private String branch;
	private double balance;
	private double interestRate;
	
	private BankAccount(String owner, String accountNumber, String branch, double balance, double interestRate) {
		super();
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.branch = branch;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public static class Builder {
		private String owner;
		private String accountNumber;
		private String branch;
		private double balance;
		private double interestRate;
		
		public Builder withOwner(String owner) {
			this.owner = owner;
			return this;
		}
		
		public Builder withAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}
		
		public Builder withBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		public Builder withBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public Builder withInterestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}
		
		public BankAccount build() {
			return new BankAccount(owner, accountNumber, branch, 
					balance, interestRate);
		}
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
