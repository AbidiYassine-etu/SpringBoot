package com.project.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cours {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_cours;
	
	@ManyToOne
	@JoinColumn(name="id_classe",nullable=false)
	private Classe classe;
	
	private String name;
	private String url;
	
	
	public Cours() {
		super();
	}


	public Cours(long id_cours, Classe classe, String name, String url) {
		super();
		this.id_cours = id_cours;
		this.classe = classe;
		this.name = name;
		this.url = url;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
	
	
	
}
