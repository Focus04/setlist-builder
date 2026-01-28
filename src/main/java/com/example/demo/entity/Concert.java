package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalTime;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "concerte")
public class Concert {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idconcert;
	
	@ManyToOne
    @JoinColumn(name = "idmelodie", nullable = false)
    private Melodie melodie;
	
	@ManyToOne
    @JoinColumn(name = "idmusician", nullable = false)
    private Musician musician;

	@Column(name = "numeconcert", nullable = false)
	private String numeconcert;

	@Column(name = "orainceput", nullable = false)
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime orainceput;
	
	@Column(name = "orafinal", nullable = false)
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime orafinal;
	
	@Column(name = "pretconcert", nullable = false)
	private Float pretconcert;

	public Concert() {}

	public Concert(Melodie melodie, Musician musician, String numeconcert, LocalTime orainceput, LocalTime orafinal, Float pretconcert) {
		super();
		this.melodie = melodie;
		this.musician = musician;
		this.numeconcert = numeconcert;
		this.orainceput = orainceput;
		this.orafinal = orafinal;
	}

	public Long getIdconcert() {
		return this.idconcert;
	}

	public void setIdconcert(Long idconcert) {
		this.idconcert = idconcert;
	}
	
	public Melodie getMelodie() {
		return this.melodie;
	}

	public void setMelodie(Melodie melodie) {
		this.melodie = melodie;
	}
	
	public Musician getMusician() {
		return this.musician;
	}

	public void setMusician(Musician musician) {
		this.musician = musician;
	}
	
	public String getNumeconcert() {
		return this.numeconcert;
	}

	public void setNumeconcert(String numeconcert) {
		this.numeconcert = numeconcert;
	}
	
	public LocalTime getOrainceput() {
		return this.orainceput;
	}

	public void setOrainceput(LocalTime orainceput) {
		this.orainceput = orainceput;
	}
	
	public LocalTime getOrafinal() {
		return this.orafinal;
	}

	public void setOrafinal(LocalTime orafinal) {
		this.orafinal = orafinal;
	}
	
	public Float getPretconcert() {
		return this.pretconcert;
	}

	public void setPretconcert(Float pretconcert) {
		this.pretconcert = pretconcert;
	}
}