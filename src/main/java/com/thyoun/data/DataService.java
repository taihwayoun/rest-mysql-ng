package com.thyoun.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataService {

	@Autowired
	private DataInterface dataInterface;
	
	public List<User> findAll(){
		return (List<User>) dataInterface.findAll();
	}
}
