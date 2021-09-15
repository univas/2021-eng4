package br.edu.univas.factory;

import br.edu.univas.vo.Button;
import br.edu.univas.vo.CheckBox;
import br.edu.univas.vo.WindowsButton;
import br.edu.univas.vo.WindowsCheckBox;

public class WindowsFactory implements AbstractFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindowsCheckBox();
	}

}
