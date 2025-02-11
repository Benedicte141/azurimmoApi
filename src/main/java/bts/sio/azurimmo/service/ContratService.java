package bts.sio.azurimmo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.model.Contrat;
import bts.sio.azurimmo.repository.ContratRepository;
import lombok.Data;

@Data
@Service
public class ContratService {
	@Autowired
	private ContratRepository contratRepository;

	public Contrat saveContrat(Contrat contrat) {
		Contrat savedContrat = contratRepository.save(contrat);
		return savedContrat;
	}
	
	public List<Contrat> findAll() {
		return contratRepository.findAll();
	}
	
	public List<Contrat> findByLocataire_Id(long id) {
		return contratRepository.findByLocataire_Id(id);
	}
	
	public List<Contrat> getContratsParLocataire(long id) {
		return contratRepository.findByLocataire_Id(id);
	}

	public List<Contrat> findByNom(String nom){
		return contratRepository.findByLocataire_Nom(nom);
	}


}
