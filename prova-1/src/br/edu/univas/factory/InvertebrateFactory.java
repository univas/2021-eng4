package br.edu.univas.factory;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Ant;
import br.edu.univas.vo.Bee;

public class InvertebrateFactory implements AbstractFactory {

	@Override
	public Animal createAnimal(AnimalType animalType) {
		if (animalType.equals(AnimalType.ANT)) {
			return new Ant();
		} else if (animalType.equals(AnimalType.BEE)) {
			return new Bee();
		}
		return null;
	}

}
