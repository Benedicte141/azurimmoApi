package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Locataire;
import bts.sio.azurimmo.service.LocataireService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api/locataires")
public class LocataireController {
	@Autowired
	private LocataireService locataireService;

	@PostMapping("/")
	public Locataire createLocataire(@RequestBody Locataire locataire) {
		return locataireService.saveLocataire(locataire);
	}

	@GetMapping("/")
	public List<Locataire> findAll() {
		return locataireService.findAll();
	}
	
}
