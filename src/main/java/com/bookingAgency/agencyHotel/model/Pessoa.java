package com.bookingAgency.agencyHotel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "Pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "cpf", length = 11)
	private String cpf;
	
	@Column(name = "name", length = 50)
	private String email;
	
	@Column(name = "name", length = 11)
	private String phone;
	
	@Column
	@NotBlank(message = "Campo obrigatório")
	private String password;
	
	public Pessoa() {
	}

	public Pessoa(Integer id, String name, String cpf, String email, String phone) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + 
				", name=" + name + 
				", cpf=" + cpf + 
				", phone=" + phone + 
				", password=" + password
				+ "]";
	}
	
}
