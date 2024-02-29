package com.projet.appGestion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="carriere")
public class Carriere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	@ManyToOne
	private Type type;
	
	@ManyToOne
	private Localite localite;
	
	
	public Carriere(int id, String nom, Type type, Localite localite) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.localite = localite;
	}
	
	public Carriere() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public Localite getLocalite() {
		return localite;
	}


	public void setLocalite(Localite localite) {
		this.localite = localite;
	}

	@Override
	public String toString() {
		return "Carriere [id=" + id + ", nom=" + nom + ", type=" + type + ", localite=" + localite + "]";
	}
	
	
	
	
	
	

	
	
	
	

}
