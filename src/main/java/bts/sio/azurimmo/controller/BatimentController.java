package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.service.BatimentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/batiments")
public class BatimentController {
	@Autowired
	private BatimentService batimentService;

	@PostMapping("/")
	public Batiment createBatiment(@RequestBody Batiment batiment) {
		return batimentService.saveBatiment(batiment);
	}
	
	@GetMapping("/")
	public List<Batiment> findAll() {
		return batimentService.findAll();
	}
	
	@GetMapping("batiment/{id}")
	public Optional<Batiment> findByBatiment_Id(@PathVariable long id) {
		return batimentService.findById(id);
	}
	

}
