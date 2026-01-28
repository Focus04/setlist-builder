package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Melodie;
import com.example.demo.service.MelodieService;

@Controller
public class MelodieController {
	private MelodieService melodieService;

	public MelodieController(MelodieService musiciaService) {
		super();
		this.melodieService = musiciaService;
	}
	
	@GetMapping("/melodii")
	public String listMelodii(Model model) {
		model.addAttribute("melodii", melodieService.getAllMelodii());
		return "melodii";
	}
	
	@PostMapping("/melodii")
	public String saveMelodie(Melodie melodie) {
		melodieService.saveMelodie(melodie);
		return "redirect:/melodii";
	}
	
	@GetMapping("/melodii/new")
	public String createMelodieForm(Model model) {
		Melodie melodie = new Melodie();
		model.addAttribute("melodie", melodie);
		return "create_melodie";
	}
	
	@GetMapping("/melodii/edit/{idmelodie}")
	public String editMelodieForm(@PathVariable Long idmelodie, Model model) {
		model.addAttribute("melodie", melodieService.getMelodieById(idmelodie));
		return "edit_melodie";
	}
	
	@GetMapping("/melodii/{idmelodie}")
	public String deleteMelodie(@PathVariable Long idmelodie) {
		melodieService.deleteMelodieById(idmelodie);
		return "redirect:/melodii";
	}

	@PostMapping("/melodii/{idmelodie}")
	public String updateMelodie(@PathVariable Long idmelodie, Melodie melodie, Model model) {
		Melodie melodieExistenta = melodieService.getMelodieById(idmelodie);
		melodieExistenta.setIdmelodie(idmelodie);
		melodieExistenta.setNumemelodie(melodie.getNumemelodie());
		melodieExistenta.setGenmelodie(melodie.getGenmelodie());
		melodieExistenta.setDuratamelodie(melodie.getDuratamelodie());
		
		melodieService.updateMelodie(melodieExistenta);
		return "redirect:/melodii";		
	}
}