package com.nu34life.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Embeddable
@Entity
@Table(name = "INGREDIENTS")
public class Ingredient implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 20)
	private String name;
	@Column(name = "description", nullable = false, length = 150)
	private String description;
	@Column(name = "carbohydrate", nullable = false)
	private Integer carbohydrate;
	@Column(name = "fat", nullable = false)
	private Integer fat;
	@Column(name = "protein", nullable = false)
	private Integer protein;
	@Column(name = "cholesterol", nullable = false)
	private Integer cholesterol;
	@Column(name = "sodium", nullable = false)
	private Integer sodium;
	@Column(name = "potasium", nullable = false)
	private Integer potasium;
	
	@OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<Allergy> allergies = new ArrayList<Allergy>();
	
	@OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<RecipeDetail> recipesdetails = new ArrayList<RecipeDetail>();

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Integer carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Integer getFat() {
		return fat;
	}

	public void setFat(Integer fat) {
		this.fat = fat;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

	public Integer getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Integer cholesterol) {
		this.cholesterol = cholesterol;
	}

	public Integer getSodium() {
		return sodium;
	}

	public void setSodium(Integer sodium) {
		this.sodium = sodium;
	}

	public Integer getPotasium() {
		return potasium;
	}

	public void setPotasium(Integer potasium) {
		this.potasium = potasium;
	}

	public List<Allergy> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}

	public List<RecipeDetail> getRecipesdetails() {
		return recipesdetails;
	}

	public void setRecipesdetails(List<RecipeDetail> recipesdetails) {
		this.recipesdetails = recipesdetails;
	}



}
