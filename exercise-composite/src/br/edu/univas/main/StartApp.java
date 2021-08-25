package br.edu.univas.main;

import br.edu.univas.vo.Circle;
import br.edu.univas.vo.Rectangle;
import br.edu.univas.vo.Square;

public class StartApp {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();

		Square s = new Square();
		s.draw();

		Rectangle r = new Rectangle();
		r.draw();
	}
}
