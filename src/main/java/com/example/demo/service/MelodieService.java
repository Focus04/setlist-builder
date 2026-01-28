package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Melodie;

public interface MelodieService {
	List<Melodie> getAllMelodii();
	
	Melodie saveMelodie(Melodie medic);
	
	Melodie getMelodieById(Long idmedic);
	
	Melodie updateMelodie(Melodie medic);
	
	void deleteMelodieById(Long idpacient);
}