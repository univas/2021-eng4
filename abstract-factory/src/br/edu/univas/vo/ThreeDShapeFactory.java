package br.edu.univas.vo;

public class ThreeDShapeFactory implements AbstractFactory {

	@Override
	public GeometricShape getShape(GeometricShapeType shapeType) {
		if (shapeType.equals(GeometricShapeType.SPHERE)) {
			return new Sphere();
		}
		return null;
	}

}
