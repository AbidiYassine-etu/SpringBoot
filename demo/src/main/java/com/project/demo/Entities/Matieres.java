package com.project.demo.Entities;


import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.JoinColumn;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Matieres {

	@Id
	@GeneratedValue
	@Column
	private Long matiere_id;
	@Column
	private String nom;
	@Column
	private int volume;
	
	@ManyToMany
	@JoinTable(
	  name = "classe_matieres", 
	  joinColumns = @JoinColumn(name = "id_classe"), 
	  inverseJoinColumns = @JoinColumn(name = "matiere_id"))
	List<Classe> classe_matieres;
	
	
	public Long getMatiere_id() {
		return matiere_id;
	}
	public void setMatiere_id(Long matiere_id) {
		this.matiere_id = matiere_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
		
	
	
}
