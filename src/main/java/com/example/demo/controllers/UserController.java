package com.example.demo.controllers;


import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.wsdto.QueryResult;
import com.example.demo.wsdto.RestRespond;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {

	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
	
	
	@RequestMapping(value ="/saveOrUpdate",method = RequestMethod.POST)
	public RestRespond saveOrUpdate(@RequestBody String userJson) throws JsonMappingException, JsonProcessingException {
		
		this.mapper = new ObjectMapper();
		User user = this.mapper.readValue(userJson, User.class);
		
		
		if(this.validate(user)) {
			return  new RestRespond(HttpStatus.NOT_ACCEPTABLE.value(), 
					"Los Campos Obligatorios no estan diligenciados");
		}
		
		this.userService.save(user);
		return new RestRespond(HttpStatus.OK.value(), "Proceso Exitoso");
	}
	
	public boolean validate(User users) {
		
		boolean  isValidate = false;
	
		if(StringUtils.trimToNull(users.getFirsName())==null) {
			
			 isValidate = false;	
		}
		if(StringUtils.trimToNull(users.getFirsSurname())== null) {
			
			 isValidate = false;	
		}
		if(StringUtils.trimToNull(users.getAdrres())== null) {
			
			 isValidate = false;	
		}
		System.out.println("prueba");
		
		return isValidate;
	}
	
	@RequestMapping(value ="/deleteUsers",method = RequestMethod.POST)
	public void deleteUsers(@RequestBody String userJson) throws Exception {
		
		this.mapper = new ObjectMapper();
		User user = this.mapper.readValue(userJson, User.class);
		
		
		if(user.getId()== null) {
			throw new Exception("EL id es null");
		}
		
		this.userService.deleteUser(user.getId());

	}
	
	
	@RequestMapping(value ="/getUsers",method = RequestMethod.GET)
	public List<User> getUsers() {
		
		return this.userService.findAll();
	}
	
}
