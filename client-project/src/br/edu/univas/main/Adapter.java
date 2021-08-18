package br.edu.univas.main;

import br.edu.univas.adapter.MoveableAdapter;
import br.edu.univas.adapter.MoveableAdapterImpl;
import br.edu.univas.vo.Ferrari;
import br.edu.univas.vo.Moveable;

public class Adapter {

	public static void main(String[] args) {
		Moveable ferrari = new Ferrari();
		System.out.println(ferrari.getSpeed() + " - MPH");
		
		MoveableAdapter adapter = new MoveableAdapterImpl(ferrari);
		System.out.println(adapter.getSpeed() + " - KMPH");
	}
}
