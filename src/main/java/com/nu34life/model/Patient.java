package com.nu34life.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Embeddable
@Entity
@Table(name = "PATIENTS")
public class Patient implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name", nullable = false, length = 20)
	private String name;
	@Column(name="last_name", nullable = false, length = 20)
	private String lastName;
	@Column(name="birthdate", nullable = false)
	private String birthdate;
	@Column(name="email", nullable = false, length = 360)
	private String email;
	@Column(name="password", nullable = false, length = 150)
	private String password;
	@Column(name = "activated", nullable = false)
	private Boolean activated;
	
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<Allergy> allergies = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<State> states = new ArrayList<State>();

	@ManyToOne(fetch = FetchType.LAZY)
	//@JsonIgnore
	@JoinColumn(name = "nutritionist_id")
	private Nutritionist nutritionist;

	public Nutritionist getNutritionist() {
		return nutritionist;
	}

	public void setNutritionist(Nutritionist nutritionist) {
		this.nutritionist = nutritionist;
	}

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


	public Boolean getActivated() {
		return activated;
	}


	public void setActivated(Boolean activated) {
		this.activated = activated;
	}


	public List<Allergy> getAllergies() {
		return allergies;
	}


	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}


	public List<State> getStates() {
		return states;
	}


	public void setStates(List<State> states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthdate=" + birthdate
				+ ", email=" + email + ", password=" + password + ", activated=" + activated + ", allergies="
				+ allergies + ", states=" + states + ", nutritionist=" + nutritionist + "]";
	}

	
	
	
}
