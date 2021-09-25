package br.edu.univas.factory;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Elephant;
import br.edu.univas.vo.Shark;

public class VertebrateFactory implements AbstractFactory {

	@Override
	public Animal createAnimal(AnimalType animalType) {
		if (animalType.equals(AnimalType.ELEPHANT)) {
			return new Elephant();
		} else if (animalType.equals(AnimalType.SHARK)) {
			return new Shark();
		}
		return null;
	}

}
