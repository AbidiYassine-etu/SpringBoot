package com.project.demo.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Classe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long id_classe;
	@Column
	private int nbm_max;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Niveau niveau;
	
	@ManyToMany(mappedBy="classe_matieres")
	List<Matieres> matieres;
	
	@OneToMany(mappedBy = "id_cours",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Cours> cours = new ArrayList<>();
	
	public Long getId_classe() {
		return id_classe;
	}

	public void setId_classe(Long id_classe) {
		this.id_classe = id_classe;
	}

	public int getNbm_max() {
		return nbm_max;
	}

	public void setNbm_max(int nbm_max) {
		this.nbm_max = nbm_max;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	
	
	
}
