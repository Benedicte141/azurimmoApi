package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Contrat;
import bts.sio.azurimmo.service.ContratService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/contrats")
public class ContratController {
	@Autowired
	private ContratService contratService;

	@PostMapping("/")
	public Contrat createContrat(@RequestBody Contrat contrat) {
		return contratService.saveContrat(contrat);
	}

	@GetMapping("/")
	public List<Contrat> findAll() {
		return contratService.findAll();
	}
	
	@GetMapping("/nom/{nom}")
	public List<Contrat> findByNom(@PathVariable String nom) {
	return contratService.findByNom(nom);
	}
	
	@GetMapping("/contrat/locataire/{id}")
	public List<Contrat> findByLocataire_Id(@PathVariable long id) {
		return contratService.findByLocataire_Id(id);
	}

	@GetMapping("/contrat/locataire/{locataireId}")
	public List<Contrat> getContratsParLocataire(@PathVariable long locataireId) {
		return contratService.getContratsParLocataire(locataireId);
	}
	
	

}
