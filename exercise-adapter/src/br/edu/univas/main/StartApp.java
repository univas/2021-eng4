package br.edu.univas.main;

import br.edu.univas.parser.Request;
import br.edu.univas.parser.StudentRequestImpl;
import br.edu.univas.parser.adapter.RequestAdapter;
import br.edu.univas.parser.adapter.StudentRequestAdapterImpl;

public class StartApp {

	public static void main(String[] args) {
		Request request = new StudentRequestImpl();
		String studentXML = request.getAllStudents();
		System.out.println(studentXML);
		System.out.println("\n\n\n");

		//json
		RequestAdapter adapter = new StudentRequestAdapterImpl(request);
		String studentJSON = adapter.getAllStudents();
		System.out.println(studentJSON);
	}
}
