package com.example.demo.entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "musician")
public class Musician {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idmusician;

	@Column(name = "numemusician", nullable = false)
	private String numemusician;

	@Column(name = "prenumemusician")
	private String prenumemusician;

	@Column(name = "genmusician")
	private String genmusician;
	
	@OneToMany(mappedBy="musician", cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Concert> concert;

	public Musician() {}

	public Musician(String nume, String prenume, String gen, Set<Concert> c) {
		super();
		this.numemusician = nume;
		this.prenumemusician = prenume;
		this.genmusician = gen;
		this.concert = c;
	}

	public Long getIdmusician() {
		return idmusician;
	}

	public void setIdmusician(Long idmusician) {
		this.idmusician = idmusician;
	}

	public String getNumemusician() {
		return numemusician;
	}

	public void setNumemusician(String nume) {
		this.numemusician = nume;
	}

	public String getPrenumemusician() {
		return prenumemusician;
	}

	public void setPrenumemusician(String prenume) {
		this.prenumemusician = prenume;
	}

	public String getGenmusician() {
		return genmusician;
	}

	public void setGenmusician(String genmusician) {
		this.genmusician = genmusician;
	}
	
	public Set<Concert> getConcert() {
		return this.concert;
	}

	public void setConcert(Set<Concert> concert) {
		this.concert = concert;
	}
}