package br.edu.univas.main;

import br.edu.univas.config.DataBaseConnection;

public class Singleton {

	public static void main(String[] args) {
		DataBaseConnection db1 = DataBaseConnection.getInstance();
		System.out.println(db1.getDataBaseConnectionInfo());
		
		DataBaseConnection db2 = DataBaseConnection.getInstance();
		System.out.println(db2.getDataBaseConnectionInfo());		
	}
}
