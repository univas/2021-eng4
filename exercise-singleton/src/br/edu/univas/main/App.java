package br.edu.univas.main;

import br.edu.univas.thread.MyThread;

public class App {

	public static void main(String[] args) {
		try {
			MyThread thread1 = new MyThread("THREAD 1");
			MyThread thread2 = new MyThread("THREAD 2");
			MyThread thread3 = new MyThread("THREAD 3");
			MyThread thread4 = new MyThread("THREAD 4");

			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
