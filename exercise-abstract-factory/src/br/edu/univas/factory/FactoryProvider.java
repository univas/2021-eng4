package br.edu.univas.factory;

public class FactoryProvider {

	public static AbstractFactory getFactory(String osName) {
		if (osName.contains("mac")) {
			return new MacFactory();
			
		} else if (osName.contains("windows")) {
			return new WindowsFactory();
		}
		
		return null;
	}
	
}
