package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class Container implements Component {

	private List<Component> components;
	
	public Container() {
		components = new ArrayList<>();
	}
	
	public void draw() {
		components.forEach(Component::draw);
	}
	
	public void addComponent(Component component) {
		components.add(component);
	}
	
	public void removeComponent(Component component) {
		components.remove(component);
	}
}
