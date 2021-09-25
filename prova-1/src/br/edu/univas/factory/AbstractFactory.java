package br.edu.univas.factory;

import br.edu.univas.vo.Animal;

public interface AbstractFactory {

	Animal createAnimal(AnimalType animalType);
	
}
