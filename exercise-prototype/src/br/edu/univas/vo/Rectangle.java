package br.edu.univas.vo;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle() {}
    
    public Rectangle(int x, int y, String color, int width, int height) {
    	this.x = x;
    	this.y = y;
    	this.color = color;
    	this.width = width;
    	this.height = height;
    }
    
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public Shape clone() {
		return new Rectangle(this.x, this.y, this.color, this.width, this.height);
	}
}
