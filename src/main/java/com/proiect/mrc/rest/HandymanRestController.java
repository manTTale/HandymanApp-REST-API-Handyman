package com.proiect.mrc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proiect.mrc.entity.Handyman;
import com.proiect.mrc.service.HandymanService;

@RestController
@RequestMapping("/api")
public class HandymanRestController {

	@Autowired
	private HandymanService handymanService;
	
	@GetMapping("/handymen")
	public List<Handyman> getHandymen(){
		return handymanService.getHandymen();
	}
	
	
	@GetMapping("/handymen/{theId}")
	public Handyman getHandyman(@PathVariable int theId) {
		Handyman theHandyman = handymanService.getHandyman(theId);
		return theHandyman;
	}
	
	
	@PostMapping("/handymen")
	public Handyman addHandyman(@RequestBody Handyman theHandyman) {
		theHandyman.setId(0);
		handymanService.saveHandyman(theHandyman);
		return theHandyman;
	}	
	
	@PutMapping("/handymen")
	public Handyman saveHandyman(@RequestBody Handyman theHandyman) {
		handymanService.saveHandyman(theHandyman);
		return theHandyman;		
	}
	
	
	@DeleteMapping("/handymen/{theId}")
	public String deleteHandyman(@PathVariable int theId) {
		handymanService.deleteHandyman(theId);
		return "The handyman with the id of " +theId+" has been deleted";
	}
}
