package br.edu.univas.main;

import java.util.List;
import java.util.Scanner;

import br.edu.univas.factory.AbstractFactory;
import br.edu.univas.factory.AnimalClassification;
import br.edu.univas.factory.AnimalType;
import br.edu.univas.factory.FactoryProvider;
import br.edu.univas.vo.Animal;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		AbstractFactory abstractFactory = null;
		List<AnimalType> animalsList = null;
		
		if (option == 1) {
			abstractFactory = FactoryProvider.getFactory(
					AnimalClassification.VERTEBRATE);
			
			animalsList = List.of(AnimalType.ELEPHANT, AnimalType.SHARK);

		} else if (option == 2) {
			abstractFactory = FactoryProvider.getFactory(
					AnimalClassification.INVERTEBRATE);
			
			animalsList = List.of(AnimalType.ANT,AnimalType.BEE);
		}
		
		for (AnimalType animalType : animalsList) {
			Animal animal = abstractFactory.createAnimal(animalType);
			animal.eat();
		}
		
		scanner.close();
	}
}
