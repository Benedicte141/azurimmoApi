package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.repository.BatimentRepository;
import lombok.Data;

@Data
@Service
public class BatimentService {
	
	@Autowired
	private BatimentRepository batimentRepository;

	// Renommer la méthode ici
	public List<Batiment> getAllBatiments() {
		return batimentRepository.findAll();
	}
	public Batiment saveBatiment(Batiment batiment) {
		if (batiment.getId() == null || batiment.getId() == 0) {
            batiment.setId(null);
        }
		return batimentRepository.save(batiment); // Sauvegarde dans la base de données
    }

	// Méthode pour récupérer un bâtiment par son ID
	public Optional<Batiment> findById(long id) {
		return batimentRepository.findById(id);
	}

}
