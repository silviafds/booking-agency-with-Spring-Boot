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
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "phone", length = 11)
	private String phone;
	
	/*Column
    @NotBlank(message = "Campo obrigatório!")
    private String login;

	@Column
	@NotBlank(message = "Campo obrigatório")
	private String password;*/
	
	@Column(name = "papel", length = 11)
	private String papel;

	public Pessoa(Integer id, String name, String email, String phone, String papel) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.papel = papel;
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

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", papel=" + papel + "]";
	}
	
	
	
}
