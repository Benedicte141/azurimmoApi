package bts.sio.azurimmo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bts.sio.azurimmo.model.Entreprise;
import bts.sio.azurimmo.repository.EntrepriseRepository;
import lombok.Data;

@Data
@Service
public class EntrepriseService {
	@Autowired
	private EntrepriseRepository entrepriseRepository;

	public Entreprise saveEntreprise(Entreprise entreprise) {
		Entreprise savedEntreprise = entrepriseRepository.save(entreprise);
		return savedEntreprise;
	}
	
	public List<Entreprise> findAll() {
		return entrepriseRepository.findAll();
	}
}
