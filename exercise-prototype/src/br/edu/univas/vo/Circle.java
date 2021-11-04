package br.edu.univas.vo;

public class Circle extends Shape {

	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, String color, int radius) {
		this.x = x;
    	this.y = y;
    	this.color = color;
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public Shape clone() {
		return new Circle(this.x, this.y, this.color, this.radius);
	}
}
