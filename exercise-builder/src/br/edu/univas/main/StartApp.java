package br.edu.univas.main;

import br.edu.univas.vo.Vehicle;

public class StartApp {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle.Builder()
				.withModel("Palio ELX")
				.withBrand("FIAT")
				.withColor("Prata")
				.withPort(4)
				.withManufactureYear(2016)
				.withModelYear(2017)
				.build();
				
		Vehicle vehicle2 = new Vehicle.Builder()
				.withBrand("Volksvagen")
				.withModel("Gol")
				.withColor("Branco")
				.withPort(4)
				.withModelYear(2019)
				.withManufactureYear(2019)
				.build();
		
		System.out.println("Veículo 1:");
		System.out.println(vehicle1);
		
		System.out.println("Veículo 2:");
		System.out.println(vehicle2);
	}
}
