package com.setlist.service;

import java.util.List;

import com.setlist.entity.Concert;

public interface ConcertService {
	List<Concert> getAllConcerte();
	
	Concert saveConcert(Concert consultatie);
	
	Concert getConcertById(Long idconsultatie);
	
	Concert updateConcert(Concert consultatie);
	
	void deleteConcertById(Long idconsultatie);
}