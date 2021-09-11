package br.edu.univas.vo;

public class FactoryProvider {

	public static AbstractFactory getFactory(ShapeType shapeType) {
		if (shapeType.equals(ShapeType.TWO_D)) {
			return new TwoDShapeFactory();
		} else if (shapeType.equals(ShapeType.THREE_D)) {
			return new ThreeDShapeFactory();
		}
		return null;
	}
	
}
