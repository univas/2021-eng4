package br.edu.univas.vo;

public class Developer implements Employee {

	private long id;
	private String name;
	
	public Developer(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void printName() {
		System.out.println("Developer: ID = " + id + " Name = " + name);
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
