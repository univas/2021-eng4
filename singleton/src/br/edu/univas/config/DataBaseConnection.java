package br.edu.univas.config;

public class DataBaseConnection {

	private final String URL = "http://xpto.com.br";
	private final String PORT = "5432";
	private final String DATABASE_NAME = "xpto";
	private final String USERNAME = "admin";
	private final String PASSWORD = "admin";
	
	private static DataBaseConnection instance;
	
	private DataBaseConnection() { }
	
	public static DataBaseConnection getInstance() {
		if (instance == null) {
			instance = new DataBaseConnection();
		}
		
		return instance;
	}
	
	public String getDataBaseConnectionInfo() {
		return URL + ":" + 
				PORT + "/" + 
				DATABASE_NAME + "/" +
				USERNAME + "@" +
				PASSWORD;
	}
	
}
