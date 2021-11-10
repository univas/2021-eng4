package br.edu.univas.main;

import br.edu.univas.vo.Explorer;
import br.edu.univas.vo.Linux;
import br.edu.univas.vo.Mac;
import br.edu.univas.vo.OperationSystem;

public class StartApp {

	public static void main(String[] args) {
		OperationSystem mac = new Mac();
		OperationSystem linux = new Linux();
		
		Explorer explorerMac = new Explorer(mac);
		Explorer explorerLinux = new Explorer(linux);
	}
}
