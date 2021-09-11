package br.edu.univas.vo;

public class TwoDShapeFactory implements AbstractFactory {

	@Override
	public GeometricShape getShape(GeometricShapeType shapeType) {
		if (shapeType.equals(GeometricShapeType.CIRCLE)) {
			return new Circle();
		} else if (shapeType.equals(GeometricShapeType.LINE)) {
			return new Line();
		}
		return null;
	}

}
