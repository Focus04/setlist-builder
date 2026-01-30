package com.setlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.setlist.entity.Musician;
import com.setlist.service.MusicianService;

@Controller
public class MusicianController {
	
	private MusicianService musicianService;

	public MusicianController(MusicianService musicianService) {
		super();
		this.musicianService = musicianService;
	}
	
	@GetMapping("/musicieni")
	public String listPacienti(Model model) {
		model.addAttribute("musicieni", musicianService.getAllMusicieni());
		return "musicieni";
	}
	
	@PostMapping("/musicieni")
	public String saveMusician(Musician musician) {
		musicianService.saveMusician(musician);
		return "redirect:/musicieni";
	}
	
	@GetMapping("/musicieni/new")
	public String createMusicianForm(Model model) {
		Musician musician = new Musician();
		model.addAttribute("musician", musician);
		return "create_musician";
	}
	
	@GetMapping("/musicieni/edit/{idmusician}")
	public String editMusicianForm(@PathVariable Long idmusician, Model model) {
		model.addAttribute("musician", musicianService.getMusicianById(idmusician));
		return "edit_musician";
	}
	
	
	@GetMapping("/musicieni/delete/{idmusician}")
	public String deleteMusician(@PathVariable Long idmusician) {
		musicianService.deleteMusicianById(idmusician);
		return "redirect:/musicieni";
	}

	@PostMapping("/musicieni/{idmusician}")
	public String updateMusician(@PathVariable Long idmusician, Musician musician, Model model) {
		Musician musicianExistent = musicianService.getMusicianById(idmusician);
		musicianExistent.setIdmusician(idmusician);
		musicianExistent.setNumemusician(musician.getNumemusician());
		musicianExistent.setPrenumemusician(musician.getPrenumemusician());
		musicianExistent.setGenmusician(musician.getGenmusician());
		
		musicianService.updateMusician(musicianExistent);
		return "redirect:/musicieni";		
	}
}