package com.thyoun.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users10")
@Data
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String county;
	private String state;
	private int zip;
	private String company_name;
	private String phone1;
	private String phone2;
	private String email;
	private String web;
	
}
