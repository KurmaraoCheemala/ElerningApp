package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	public ResponseEntity<String> welcomeMsg(){
		String msg="welcome to this page";
		return new ResponseEntity<>(msg, HttpStatus.ACCEPTED);
	}

}
