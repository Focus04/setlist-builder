package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Concert;

public interface ConcertService {
	List<Concert> getAllConcerte();
	
	Concert saveConcert(Concert consultatie);
	
	Concert getConcertById(Long idconsultatie);
	
	Concert updateConcert(Concert consultatie);
	
	void deleteConcertById(Long idconsultatie);
}