package com.setlist.service;

import java.util.List;

import com.setlist.entity.Musician;

public interface MusicianService {
	List<Musician> getAllMusicieni();
	
	Musician saveMusician(Musician pacient);
	
	Musician getMusicianById(Long idpacient);
	
	Musician updateMusician(Musician pacient);
	
	void deleteMusicianById(Long idpacient);
}