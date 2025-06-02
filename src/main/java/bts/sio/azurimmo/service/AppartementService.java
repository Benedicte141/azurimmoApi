package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bts.sio.azurimmo.model.Appartement;
import bts.sio.azurimmo.repository.AppartementRepository;
import lombok.Data;

@Data
@Service
public class AppartementService {

	@Autowired
	private AppartementRepository appartementRepository;

	public Appartement saveAppartement(Appartement appartement) {
		if (appartement.getId() == 0) {
            appartement.setId(null);
        }
		Appartement savedAppartement = appartementRepository.save(appartement);
		return savedAppartement;
	}
	
	
	public List<Appartement> getAppartementsParBatiment(long id) {
		return appartementRepository.findByBatiment_Id(id);
	}
		
	public List<Appartement> findByBatiment_Id(long id) {
		return appartementRepository.findByBatiment_Id(id);
	}

	public List<Appartement> findBySurfaceGreaterThan(float surface) {
		return appartementRepository.findBySurfaceGreaterThan(surface);
	}

	public List<Appartement> findAll() {
		return appartementRepository.findAll();
	}
	
	public List<Appartement> findByVille(String ville) {
		return appartementRepository.findByBatiment_Ville(ville);
		}
	
	public void deleteAppartement(Long id) {
	    appartementRepository.deleteById(id);
	}
	
	// Méthode pour récupérer un appartement par son ID
		public Optional<Appartement> findById(long id) {
			return appartementRepository.findById(id);
		}

}
