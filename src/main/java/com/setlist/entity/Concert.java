package com.setlist.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
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

	@Column(name = "numeconcert")
	private String numeconcert = "";

	@Column(name = "orainceput")
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime orainceput = LocalTime.of(0, 0);
	
	@Column(name = "orafinal")
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime orafinal = LocalTime.of(0, 0);
	
	@Column(name = "pretconcert")
	private BigDecimal pretconcert = BigDecimal.ZERO;

	public Concert() {}

	public Concert(Melodie melodie, Musician musician, String numeconcert, LocalTime orainceput, LocalTime orafinal, BigDecimal pretconcert) {
		super();
		this.melodie = melodie;
		this.musician = musician;
		this.numeconcert = numeconcert;
		this.orainceput = orainceput;
		this.orafinal = orafinal;
		this.pretconcert = pretconcert;
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
	
	public BigDecimal getPretconcert() {
		return this.pretconcert;
	}

	public void setPretconcert(BigDecimal pretconcert) {
		this.pretconcert = pretconcert;
	}
}