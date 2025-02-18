package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Appartement;
import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.service.AppartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/appartements")
public class AppartementController {

	@Autowired
	private AppartementService appartementService;

	@PostMapping("/")
	public Appartement createAppartement(@RequestBody Appartement appartement) {
		return appartementService.saveAppartement(appartement);
	}

	@GetMapping("/")
	public List<Appartement> findAll() {
		return appartementService.findAll();
	}

	@GetMapping("/appartement/batiment/{id}")
	public List<Appartement> findByBatiment_Id(@PathVariable long id) {
		return appartementService.findByBatiment_Id(id);
	}

	@GetMapping("/batiment/batiment/{batimentId}")
	public List<Appartement> getAppartementsParBatiment(@PathVariable long batimentId) {
		return appartementService.getAppartementsParBatiment(batimentId);
	}

	@GetMapping("/appartement/{surface}")
	public List<Appartement> findBySurfaceGreaterThan(@PathVariable float surface) {
		return appartementService.findBySurfaceGreaterThan(surface);
	}
	
	@GetMapping("/ville/{ville}")
	public List<Appartement> findByVille(@PathVariable String ville) {
	return appartementService.findByVille(ville);
	}

}
