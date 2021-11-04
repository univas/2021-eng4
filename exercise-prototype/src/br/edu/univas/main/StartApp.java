package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.Circle;
import br.edu.univas.vo.Rectangle;
import br.edu.univas.vo.Shape;

public class StartApp {

	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapesCopy.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);
        
        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapesCopy.add(anotherRectangle);
	}
}
