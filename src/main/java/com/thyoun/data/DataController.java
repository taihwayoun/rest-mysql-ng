package com.thyoun.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	private DataService service;
	
	@Autowired
	public DataController(DataService di) {
		this.service = di;
	}
	
	@GetMapping("/all")
	public List<User> getAll(){
		return (List<User>) service.findAll();
	}
}
