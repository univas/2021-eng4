package br.edu.univas.factory;

import br.edu.univas.vo.Button;
import br.edu.univas.vo.CheckBox;

public interface AbstractFactory {

	Button createButton();
	
	CheckBox createCheckBox();
	
}
