package com.setlist.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.setlist.entity.Concert;
import com.setlist.repository.ConcertRepository;
import com.setlist.service.ConcertService;

@Service
public class ConcertServiceImpl implements ConcertService{
	private ConcertRepository concertRepository;
	
	public ConcertServiceImpl(ConcertRepository concertRepository) {
		super();
		this.concertRepository = concertRepository;
	}

	@Override
	public List<Concert> getAllConcerte() {
		return concertRepository.findAll();
	}

	@Override
	@Transactional
	public Concert saveConcert(Concert concert) {
		return concertRepository.save(concert);
	}

	@Override
	public Concert getConcertById(Long idconcert) {
		return concertRepository.findById(idconcert).get();
	}

	@Override
	public Concert updateConcert(Concert concert) {
		return concertRepository.save(concert);
	}

	@Override
	public void deleteConcertById(Long idconcert) {
		concertRepository.deleteById(idconcert);	
	}
}