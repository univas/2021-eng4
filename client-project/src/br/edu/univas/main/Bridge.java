package br.edu.univas.main;

import br.edu.univas.bridge.vo.Blue;
import br.edu.univas.bridge.vo.Circle;
import br.edu.univas.bridge.vo.Color;
import br.edu.univas.bridge.vo.Red;
import br.edu.univas.bridge.vo.Shape;
import br.edu.univas.bridge.vo.Square;

public class Bridge {

	public static void main(String[] args) {
		Color redColor = new Red();
		Color blueColor = new Blue();
		
		Shape blueSquare = new Square(blueColor);
		Shape redSquare = new Square(redColor);
		
		Shape blueCircle = new Circle(blueColor);
		Shape redCircle = new Circle(redColor);
	}
}
