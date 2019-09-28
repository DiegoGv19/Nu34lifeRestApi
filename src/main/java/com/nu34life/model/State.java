package com.nu34life.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STATES")
public class State implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "description", nullable = false, length = 360)
	private String description;
	@Column(name = "height", nullable = false)
	private Integer height;
	@Column(name = "weight", nullable = false)
	private Integer weight;
	@Column(name = "glucose", nullable = false)
	private Integer glucose;
	@Column(name = "affiliated", nullable = false)
	private Boolean affiliated;
	@Column(name = "generatedDate", nullable = false)
	private String generatedDate;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	//@JsonIgnore
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@ManyToMany
	@JoinTable(name = "DRUGS_STATES"
	,joinColumns = @JoinColumn(name="state_id")
	,inverseJoinColumns = @JoinColumn(name="drug_id"))
	private List<Drug> drug;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getGlucose() {
		return glucose;
	}

	public void setGlucose(Integer glucose) {
		this.glucose = glucose;
	}

	public Boolean getAffiliated() {
		return affiliated;
	}

	public void setAffiliated(Boolean affiliated) {
		this.affiliated = affiliated;
	}

	public String getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<Drug> getDrug() {
		return drug;
	}

	public void setDrug(List<Drug> drug) {
		this.drug = drug;
	}
	
	
	
	
	
}
