package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Appartement;
import bts.sio.azurimmo.service.AppartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


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
	
	@GetMapping("/appartements/{id}")
	public Optional<Appartement> getAppartementById(@PathVariable long id) {
	    return appartementService.findById(id);
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
	
	@DeleteMapping("/appartements/{id}")
	public ResponseEntity<Void> deleteAppartement(@PathVariable Long id) {
	    appartementService.deleteAppartement(id);
	    return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/appartements/{id}")
	public Appartement updateAppartement(@PathVariable Long id, @RequestBody Appartement updatedAppartement) {
	    updatedAppartement.setId(id);
	    return appartementService.saveAppartement(updatedAppartement);
	}

}
