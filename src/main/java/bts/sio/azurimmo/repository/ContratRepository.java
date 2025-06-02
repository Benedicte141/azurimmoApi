package bts.sio.azurimmo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bts.sio.azurimmo.model.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long>{

	List<Contrat> findAll();

	List<Contrat> findByLocataire_Nom(String nom);

	List<Contrat> findByLocataire_Id(long id);
	
	boolean existsByAppartementId(Long appartementId);
}
