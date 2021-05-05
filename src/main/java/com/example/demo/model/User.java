package com.example.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Access(AccessType.FIELD)
public class User  {

	private static final long serialVersionUID = -7346797309553359358L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",unique = true,nullable = false)
	private Long id;
	
	
	@Column(name="firs_name",nullable = false,length = 255)
	private String firsName ;
	
	@Column(name="second_name",nullable = true,length = 255)
	private String secondName ;
	
	@Column(name="firs_surname",nullable = false,length = 255)
	private String	firsSurname ;
	
	@Column(name="second_surname",nullable = true,length = 255)
	private String	secondSurname ;
	
	@Column(name="phone",nullable = true,length = 30)
	private String	phone ;
	
	@Column(name="adrres",nullable = false,length = 150)
	private String	adrres ;
	
	
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirsSurname() {
		return firsSurname;
	}
	public void setFirsSurname(String firsSurname) {
		this.firsSurname = firsSurname;
	}
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdrres() {
		return adrres;
	}
	public void setAdrres(String adrres) {
		this.adrres = adrres;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
