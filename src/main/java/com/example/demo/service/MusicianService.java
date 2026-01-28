package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Musician;

public interface MusicianService {
	List<Musician> getAllMusicieni();
	
	Musician saveMusician(Musician pacient);
	
	Musician getMusicianById(Long idpacient);
	
	Musician updateMusician(Musician pacient);
	
	void deleteMusicianById(Long idpacient);
}