package com.example.demo;

//Importing required classes
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//Class
public class ConsumeXMLResponse {

	RestTemplate rest = new RestTemplate();
	
	public ResponseEntity<EntityModel> get(String id) {
		
		return rest.getForEntity("http://localhost:8080/xml-output/get/{id}",
				EntityModel.class, id);
		
	}
}

