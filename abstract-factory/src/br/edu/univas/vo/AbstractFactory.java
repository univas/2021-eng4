package br.edu.univas.vo;

public interface AbstractFactory {

	GeometricShape getShape(GeometricShapeType shapeType);
	
}
