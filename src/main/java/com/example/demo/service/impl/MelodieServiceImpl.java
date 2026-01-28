package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Melodie;
import com.example.demo.repository.MelodieRepository;
import com.example.demo.service.MelodieService;

@Service
public class MelodieServiceImpl implements MelodieService{
	private MelodieRepository melodieRepository;
	
	public MelodieServiceImpl(MelodieRepository melodieRepository) {
		super();
		this.melodieRepository = melodieRepository;
	}

	@Override
	public List<Melodie> getAllMelodii() {
		return melodieRepository.findAll();
	}

	@Override
	@Transactional
	public Melodie saveMelodie(Melodie melodie) {
		return melodieRepository.save(melodie);
	}

	@Override
	public Melodie getMelodieById(Long idmelodie) {
		return melodieRepository.findById(idmelodie).get();
	}

	@Override
	public Melodie updateMelodie(Melodie melodie) {
		return melodieRepository.save(melodie);
	}

	@Override
	public void deleteMelodieById(Long idmelodie) {
		melodieRepository.deleteById(idmelodie);	
	}
}