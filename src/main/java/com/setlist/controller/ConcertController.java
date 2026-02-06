package com.setlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.setlist.entity.Concert;
import com.setlist.entity.Melodie;
import com.setlist.entity.Musician;
import com.setlist.repository.MelodieRepository;
import com.setlist.repository.MusicianRepository;
import com.setlist.service.ConcertService;

@Controller
public class ConcertController {
	private ConcertService concertService;
	
	@Autowired
	private MusicianRepository musicianRepo;
	
	@Autowired
	private MelodieRepository melodieRepo;

	public ConcertController(ConcertService concertService) {
		super();
		this.concertService = concertService;
	}
	
	@GetMapping("/concerte")
	public String listConcerte(Model model) {
		model.addAttribute("concerte", concertService.getAllConcerte());
		return "concerte";
	}
	
	@PostMapping("/concerte")
	public String saveConcert(Concert concert) {		
		concertService.saveConcert(concert);
		return "redirect:/concerte";
	}
	
	@GetMapping("/concerte/new")
	public String createConcertForm(Model model) {
		List<Musician> totiMusicienii = musicianRepo.findAll();
		List<Melodie> toateMelodiile = melodieRepo.findAll();
		
		Concert concert = new Concert();
		model.addAttribute("concert", concert);
		model.addAttribute("totimusicienii", totiMusicienii);
		model.addAttribute("toatemelodiile", toateMelodiile);
		
		return "create_concert";
	}
	
	@GetMapping("/concerte/edit/{idconcert}")
	public String editMelodieForm(@PathVariable Long idconcert, Model model) {
		List<Musician> totiMusicienii = musicianRepo.findAll();
		List<Melodie> toateMelodiile = melodieRepo.findAll();

		model.addAttribute("concert", concertService.getConcertById(idconcert));
		model.addAttribute("totimusicienii", totiMusicienii);
		model.addAttribute("toatemelodiile", toateMelodiile);
		
		return "edit_concert";
	}
	
	@GetMapping("/concerte/delete/{idconcert}")
	public String deleteConcert(@PathVariable Long idconcert) {
		concertService.deleteConcertById(idconcert);
		return "redirect:/concerte";
	}

	@PostMapping("/concerte/{idconcert}")
	public String updateConcert(@PathVariable Long idconcert, Concert concert, Model model) {
		Concert concertExistent = concertService.getConcertById(idconcert);
		concertExistent.setIdconcert(idconcert);
		concertExistent.setMusician(concert.getMusician());
		concertExistent.setMelodie(concert.getMelodie());
		concertExistent.setNumeconcert(concert.getNumeconcert());
		concertExistent.setOrainceput(concert.getOrainceput());
		concertExistent.setOrafinal(concert.getOrafinal());
		concertExistent.setPretconcert(concert.getPretconcert());

		concertService.updateConcert(concertExistent);
		return "redirect:/concerte";		
	}
}