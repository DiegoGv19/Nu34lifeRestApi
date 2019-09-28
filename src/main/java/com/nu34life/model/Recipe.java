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
@Table(name = "RECIPES")
public class Recipe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name", nullable = false, length = 20)
	private String name;

	
	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<RecipeDetail> recipesdetails = new ArrayList<RecipeDetail>();
	
	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	//@JsonIgnore
	private List<PlanRecipe> planrecipe = new ArrayList<PlanRecipe>();

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

	public List<RecipeDetail> getRecipesdetails() {
		return recipesdetails;
	}

	public void setRecipesdetails(List<RecipeDetail> recipesdetails) {
		this.recipesdetails = recipesdetails;
	}

	public List<PlanRecipe> getPlanrecipe() {
		return planrecipe;
	}

	public void setPlanrecipe(List<PlanRecipe> planrecipe) {
		this.planrecipe = planrecipe;
	}



	
}
