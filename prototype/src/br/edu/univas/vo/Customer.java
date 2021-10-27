package br.edu.univas.vo;

public class Customer implements Prototype {

	private String name;
	private String cpf;
	private String address;
	private int phone;
	
	public Customer(String name, String cpf, String address, int phone) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.address = address;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	@Override
	public Prototype clone() {
		return new Customer(this.name, this.cpf, 
				this.address, this.phone);
	}
}
