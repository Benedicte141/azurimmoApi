package bts.sio.azurimmo.controller;


import bts.sio.azurimmo.model.Entreprise;
import bts.sio.azurimmo.service.EntrepriseService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/entreprises")
public class EntrepriseController {
	@Autowired
	private EntrepriseService entrepriseService;

	@PostMapping("/")
	public Entreprise createEntreprise(@RequestBody Entreprise entreprise) {
		return entrepriseService.saveEntreprise(entreprise);
	}

	@GetMapping("/")
	public List<Entreprise> findAll() {
		return entrepriseService.findAll();
	}

}
