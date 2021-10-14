package br.edu.univas.thread;

import java.io.IOException;

import br.edu.univas.log.MyLog;

public class MyThread extends Thread {

	private String name;
	private MyLog log;
	
	public MyThread(String threadName) throws IOException {
		log = new MyLog();
		this.name = threadName;
		log.log("Creating " + this.name);
	}
	
	@Override
	public void run() {
		try {
			log.log("Running " + this.name);
			for (int i = 0; i < 10; i++) {
				try {
					log.log(this.name + " hellow " + i);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			log.log("Exiting " + this.name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
