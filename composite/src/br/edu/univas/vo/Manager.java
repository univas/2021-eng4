package br.edu.univas.vo;

public class Manager implements Employee {

	private long id;
	private String name;
	
	public Manager(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void printName() {
		System.out.println("Manager: ID = " + id + " Name = " + name);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
