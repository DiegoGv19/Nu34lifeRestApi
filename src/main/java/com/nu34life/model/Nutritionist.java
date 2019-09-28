package com.nu34life.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NUTRITIONISTS")
public class Nutritionist implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 20)
	private String name;
	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;
	@Column(name = "birthdate", nullable = false)
	private String birthdate;
	@Column(name = "email", nullable = false, length = 360)
	private String email;
	@Column(name = "password", nullable = false, length = 150)
	private String password;
	@Column(name = "validated", nullable = false)
	private Boolean validated;
	@Column(name = "activated", nullable = false)
	private Boolean activated;
	
	@OneToMany(mappedBy = "nutritionist", cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<Suscription> suscriptions = new ArrayList<Suscription>();

	@OneToMany(mappedBy = "nutritionist", cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<Patient> patients = new ArrayList<Patient>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public List<Suscription> getSuscriptions() {
		return suscriptions;
	}

	public void setSuscriptions(List<Suscription> suscriptions) {
		this.suscriptions = suscriptions;
	}


	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Nutritionist [id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthdate=" + birthdate
				+ ", email=" + email + ", password=" + password + ", validated=" + validated + ", activated="
				+ activated + ", suscriptions=" + suscriptions + ", patients=" + patients + "]";
	}
	
	
	
}
