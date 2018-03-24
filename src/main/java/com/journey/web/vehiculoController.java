package com.journey.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.journey.model.vehiculo;

@Controller
public class vehiculoController {

	@GetMapping("/new")
	public String initCreationForm(Model model) {
		model.addAttribute("vehiculo", new vehiculo());
		return "journeyForm";		
	} 
	
	@PostMapping("/new")	
	public String submitForm(@ModelAttribute vehiculo vehiculo) {
		
		switch(vehiculo.getMarca()){
			
			case "marca1": vehiculo.setResultado(vehiculo.getRecorrido()/40);
			break;
			
			case "marca2": vehiculo.setResultado(vehiculo.getRecorrido()/35);
			break;
			
			case "marca3": vehiculo.setResultado(vehiculo.getRecorrido()/45);
			break;
		}
		
	return "resultForm";
	}

}