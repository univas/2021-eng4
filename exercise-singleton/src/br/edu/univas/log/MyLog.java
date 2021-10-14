package br.edu.univas.log;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyLog {

	private final String FILE_NAME = "/home/rodrigo.faria/output/log.txt";
	private BufferedOutputStream bufferedOutputStream;
	
	public MyLog() {
		try {
			FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
			bufferedOutputStream = new BufferedOutputStream(outputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String content) throws IOException {
		bufferedOutputStream.write(content.getBytes());
		bufferedOutputStream.write("\n".getBytes());
		bufferedOutputStream.flush();
	}
}
