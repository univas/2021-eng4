package br.edu.univas.main;

import br.edu.univas.parser.Request;
import br.edu.univas.parser.StudentRequestImpl;

public class StartApp {

	public static void main(String[] args) {
		Request request = new StudentRequestImpl();
		String studentXML = request.getAllStudents();
		System.out.println(studentXML);
	}
}
