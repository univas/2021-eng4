package br.edu.univas.main;

import br.edu.univas.vo.FactoryProvider;
import br.edu.univas.vo.GeometricShape;
import br.edu.univas.vo.GeometricShapeType;
import br.edu.univas.vo.ShapeType;

public class AbstractFactory {

	public static void main(String[] args) {
//		Circle circle = new Circle();
//		circle.draw();
//		
//		Line line = new Line();
//		line.draw();
//		
//		Sphere sphere = new Sphere();
//		sphere.draw();
		
		br.edu.univas.vo.AbstractFactory factory = 
				FactoryProvider.getFactory(ShapeType.TWO_D);
		GeometricShape geometricShape = 
				factory.getShape(GeometricShapeType.CIRCLE);
		geometricShape.draw();
		
		GeometricShape line = factory.getShape(GeometricShapeType.LINE);
		line.draw();
		
		factory = FactoryProvider.getFactory(ShapeType.THREE_D);
		GeometricShape sphere = factory.getShape(GeometricShapeType.SPHERE);
		sphere.draw();
	}
}
