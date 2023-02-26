package com.bookingAgency.agencyHotel.dto;

import java.io.Serializable;

import com.bookingAgency.agencyHotel.model.Pessoa;

public class PessoaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String papel;
	
	public PessoaDTO() {
		
	}
	
	public PessoaDTO(Pessoa obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
		phone = obj.getPhone();
		papel = obj.getPapel();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
}
