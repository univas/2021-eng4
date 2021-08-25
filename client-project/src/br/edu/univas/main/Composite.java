package br.edu.univas.main;

import br.edu.univas.vo.Department;
import br.edu.univas.vo.Developer;
import br.edu.univas.vo.Employee;
import br.edu.univas.vo.Manager;

public class Composite {

	public static void main(String[] args) {
		Department department1 = new Department("Desenvolvimento");
		
		Employee developer1 = new Developer(1l, "João");
		Employee developer2 = new Developer(3l, "Maria");
		
		Employee manager1 = new Manager(5l, "José");
		
		department1.addChild(manager1);
		department1.addChild(developer1);
		department1.addChild(developer2);
		
		Department department2 = new Department("Desenvolvimento Mobile");
		
		Employee developer3 = new Developer(11l, "Rodrigo");
		Employee developer4 = new Developer(13l, "Roberto");
		
		Employee manager2 = new Manager(15l, "André");
		
		department2.addChild(manager2);
		department2.addChild(developer3);
		department2.addChild(developer4);
		department1.addChild(department2);
		
		System.out.println("IMPRIMINDO ESTRUTURA:::");
		department1.printName();
	}
}
