package br.edu.univas.factory;

public class FactoryProvider {

	public static AbstractFactory getFactory(
			AnimalClassification animalClassification) {
		if (AnimalClassification.VERTEBRATE.equals(animalClassification)) {
			return new VertebrateFactory();
		
		} else if (AnimalClassification.INVERTEBRATE.equals(animalClassification)) {
			return new InvertebrateFactory();
		}
		return null;
	}
	
}
