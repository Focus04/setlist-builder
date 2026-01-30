package com.setlist.entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "melodii")
public class Melodie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idmelodie;

	@Column(name = "numemelodie", nullable = false)
	private String numemelodie;

	@Column(name = "genmelodie")
	private String genmelodie;

	@Column(name = "duratamelodie")
	private Long duratamelodie;
	
	@OneToMany(mappedBy="melodie", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Concert> concert;

	public Melodie() {}

	public Melodie(String nume, String gen, Long durata, Set<Concert> c) {
		super();
		this.numemelodie = nume;
		this.genmelodie = gen;
		this.duratamelodie = durata;
		this.concert = c;
	}

	public Long getIdmelodie() {
		return idmelodie;
	}

	public void setIdmelodie(Long idmelodie) {
		this.idmelodie = idmelodie;
	}

	public String getNumemelodie() {
		return numemelodie;
	}

	public void setNumemelodie(String nume) {
		this.numemelodie = nume;
	}

	public String getGenmelodie() {
		return genmelodie;
	}

	public void setGenmelodie(String genmelodie) {
		this.genmelodie = genmelodie;
	}
	
	public Long getDuratamelodie() {
		return duratamelodie;
	}

	public void setDuratamelodie(Long duratamelodie) {
		this.duratamelodie = duratamelodie;
	}
	
	public Set<Concert> getConcert() {
		return this.concert;
	}

	public void setConcert(Set<Concert> concert) {
		this.concert = concert;
	}
}