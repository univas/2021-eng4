package br.edu.univas.main;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Canino;
import br.edu.univas.vo.Felino;
import br.edu.univas.vo.Funcionario;
import br.edu.univas.vo.Gato;
import br.edu.univas.vo.Login;
import br.edu.univas.vo.User;
import br.edu.univas.vo.XPTO;

//e quando utilizarmos o "var"????
//como o compilador sabe quais são os metodos/atributos
//que ele pode acessar!?
public class StartApp {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setPeso(10);
		cachorro1.setRaca("Pitbull");
		
		Gato gato1 = new Gato();
		gato1.setPeso(3);
		gato1.setRaca("Siames");

		Animal animal1 = new Gato();
		animal1.setPeso(12);
		animal1.setRaca("raça_desconhecida");
		animal1.dormir();
		
//		if (animal1 instanceof Gato) {
//			//option 1	
//			Gato g1 = (Gato) animal1;
//			g1.dormir();
//			
//			//option 2
//			((Gato) animal1).dormir();
//		}
		
		Animal animal2 = new Cachorro();
		animal2.setPeso(14);
		animal2.setRaca("raça_desconhecida_2");
		animal2.dormir();
		
		Felino felino1 = new Gato();
		Canino canino1 = new Cachorro();
		canino1.dormir();
		
		Felino f1 = null;
		//f1.dormir(); NullPointerException	
		
		///////
		User user1 = new User();
		user1.setLogin("admin");
		user1.setPassword("admin111");
		
		if (user1.authentication()) {
			System.out.println("Usuario está autenticado!");
			user1.doSomething();

		} else {
			System.out.println("Usuario/Senha incorretos!");
		}
		
		StartApp app = new StartApp();
		app.executeLogin(user1);
		app.anyMethod(user1);
		
		
		Funcionario func1 = new Funcionario();
		app.executeLogin(func1);
	}
	
	public void executeLogin(Login login) {
		if (login.authentication()) {
			//continue the code
		} else {
			//throw any exception
		}
	}
	
	public void anyMethod(XPTO anyClass) {
		anyClass.doSomething();
	}
}
