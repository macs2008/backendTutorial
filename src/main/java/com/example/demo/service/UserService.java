package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

	/**
	 * Guardar usuario
	 * @param user
	 * @return el usuario
	 */
	User save(User user);

	
	/**
	 * Recupera la lista 
	 * @return  la lista con los usuarios
	 */
	List<User> findAll();


	void deleteUser(Long id);



}
