package com.setlist.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.setlist.entity.Musician;
import com.setlist.repository.MusicianRepository;
import com.setlist.service.MusicianService;

@Service
public class MusicianServiceImpl implements MusicianService{
	private MusicianRepository musicianRepository;
	
	public MusicianServiceImpl(MusicianRepository musicianRepository) {
		super();
		this.musicianRepository = musicianRepository;
	}

	@Override
	public List<Musician> getAllMusicieni() {
		return musicianRepository.findAll();
	}

	@Override
	@Transactional
	public Musician saveMusician(Musician musician) {
		return musicianRepository.save(musician);
	}

	@Override
	public Musician getMusicianById(Long idmusician) {
		return musicianRepository.findById(idmusician).get();
	}

	@Override
	public Musician updateMusician(Musician musician) {
		return musicianRepository.save(musician);
	}

	@Override
	public void deleteMusicianById(Long idmusician) {
		musicianRepository.deleteById(idmusician);	
	}
}