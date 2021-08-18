package br.edu.univas.adapter;

import br.edu.univas.vo.Moveable;

public class MoveableAdapterImpl implements MoveableAdapter {

	private Moveable moveable;
	
	public MoveableAdapterImpl(Moveable moveable) {
		this.moveable = moveable;
	}
	
	@Override
	public double getSpeed() {
		return moveable.getSpeed() * 1.609;
	}
}
