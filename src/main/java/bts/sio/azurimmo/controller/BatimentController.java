package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.service.BatimentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api/batiments")
public class BatimentController {

		
		@Autowired
		private BatimentService batimentService;

		// Créer un bâtiment
		@PostMapping("/")
		public ResponseEntity<Batiment> createBatiment(@RequestBody Batiment batiment) {
	        System.out.println("Données reçues du client : " + batiment);
	        Batiment newBatiment = batimentService.saveBatiment(batiment);
	        return new ResponseEntity<>(newBatiment, HttpStatus.CREATED);
	    }
		
		// Récupérer tous les bâtiments avec une nouvelle URL
		@GetMapping("/")
		public List<Batiment> getAllBatiments() {
		    return batimentService.getAllBatiments();
		}
		
		// Récupérer un bâtiment par ID
		@GetMapping("/batiment/{id}")
		public Optional<Batiment> findByBatiment_Id(@PathVariable long id) {
			return batimentService.findById(id);
		}
}

	
	

	