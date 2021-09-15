package br.edu.univas.factory;

import br.edu.univas.vo.Button;
import br.edu.univas.vo.CheckBox;
import br.edu.univas.vo.MacButton;
import br.edu.univas.vo.MacCheckBox;

public class MacFactory implements AbstractFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacCheckBox();
	}

}
