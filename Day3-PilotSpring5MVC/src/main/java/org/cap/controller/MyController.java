package org.cap.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.cap.model.Pilot;
import org.cap.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	private PilotService pilotService;
	private Pilot pilot;

	@RequestMapping("/hello")
	public ModelAndView greetUser() {
		String message = "Hello, Good Morning";
		return new ModelAndView("helloPage", "greetings", message);

	}

	@RequestMapping("/validateLogin")
	public String validateLogin(ModelMap map, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (username.equals("tom") && password.equals("tom123")) {
			List<Pilot> pilots=pilotService.getAll();
			map.put("pilots", pilots);
			map.put("pilot", new Pilot());
			return "pilotForm";
		}
		return "redirect:/";
	}
	@RequestMapping("/pilotForm")
	public String getPilotForm(ModelMap map) {
		
		List<Pilot> pilots=pilotService.getAll();
		map.put("pilots", pilots);
		
		if(pilot!=null) {
			map.put("pilot",pilot);
		}
		else {
			map.put("pilot", new Pilot());			
		}
		
		
		return "pilotForm";
	}
	/* @RequestMapping(value="/savePilot",method=RequestMethod.POST) */

	
	@GetMapping("/delete/{pilotId}")
	public String deletePilot(@PathVariable("pilotId") Integer pilotId) {
		pilotService.delete(pilotId);
		
		return "redirect:/pilotForm";
	}
	@RequestMapping("/updatePilot")
	public String updatePilot(@ModelAttribute("pilot") Pilot pilot1) {
		
		if(pilot1!=null) {
			pilotService.update(pilot1);
		pilot=null;
		}
		return "redirect:/pilotForm";
	}
	
	@GetMapping("/update/{pilotId}")
	public String updatePilot(@PathVariable("pilotId")Integer pilotId,ModelMap map) {
		pilot = pilotService.findPilot(pilotId);
		return "redirect:/pilotForm";
	}

}
