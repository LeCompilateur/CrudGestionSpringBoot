package com.projet.appGestion.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="lacalite")
public class Localite {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ville")
	private String ville;
	
	
	@Column(name="prefecture")
	private String prefecture;
	
	@Column(name="region")
	private String region;

	public Localite(int id, String ville, String prefecture, String region) {
		super();
		this.id = id;
		this.ville = ville;
		this.prefecture = prefecture;
		this.region = region;
	}
	
	public Localite() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPrefecture() {
		return prefecture;
	}

	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Localite [id=" + id + ", ville=" + ville + ", prefecture=" + prefecture + ", region=" + region + "]";
	}
	
	
	
	
	
	
	
	
}
