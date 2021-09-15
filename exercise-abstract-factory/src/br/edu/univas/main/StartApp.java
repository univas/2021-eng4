package br.edu.univas.main;

import br.edu.univas.factory.AbstractFactory;
import br.edu.univas.factory.FactoryProvider;
import br.edu.univas.vo.Button;
import br.edu.univas.vo.CheckBox;
import br.edu.univas.vo.MacButton;
import br.edu.univas.vo.MacCheckBox;
import br.edu.univas.vo.WindowsButton;
import br.edu.univas.vo.WindowsCheckBox;

public class StartApp {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name").toLowerCase();
//		if (osName.contains("windows")) {
//			WindowsButton button = new WindowsButton();
//			button.paint();
//			
//			WindowsCheckBox checkBox = new WindowsCheckBox();
//			checkBox.paint();
//			
//		} else if (osName.contains("mac")) {
//			MacButton button = new MacButton();
//			button.paint();
//			
//			MacCheckBox checkBox = new MacCheckBox();
//			checkBox.paint();
//		} else {
//			System.out.println("System not supported :( " + osName);
//		}
		
		AbstractFactory abstractFactory = FactoryProvider.getFactory(osName);
		
		Button button = abstractFactory.createButton();
		button.paint();
		
		CheckBox checkBox = abstractFactory.createCheckBox();
		checkBox.paint();
	}
}
