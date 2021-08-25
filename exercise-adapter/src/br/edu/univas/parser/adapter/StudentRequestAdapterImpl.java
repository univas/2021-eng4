package br.edu.univas.parser.adapter;

import org.json.JSONObject;
import org.json.XML;

import br.edu.univas.parser.Request;

public class StudentRequestAdapterImpl implements RequestAdapter {

	private Request request;
	
	public StudentRequestAdapterImpl(Request request) {
		this.request = request;
	}
	
	@Override
	public String getAllStudents() {
		String resultXML = request.getAllStudents();
		JSONObject json = XML.toJSONObject(resultXML);
		return json.toString();
	}

}
