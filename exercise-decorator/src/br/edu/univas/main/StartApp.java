package br.edu.univas.main;

import br.edu.univas.vo.Bulbs;
import br.edu.univas.vo.Candy;
import br.edu.univas.vo.ChristmasTree;
import br.edu.univas.vo.ChristmasTreeImpl;

public class StartApp {

	public static void main(String[] args) {
		ChristmasTree tree = new ChristmasTreeImpl();
		ChristmasTree bulb = new Bulbs();
		ChristmasTree candy = new Candy();
		
		String myTree = tree.decorate() + 
				bulb.decorate() +
				candy.decorate();
		System.out.println(myTree);
		
	}
}
