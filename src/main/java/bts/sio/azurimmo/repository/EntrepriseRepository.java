package bts.sio.azurimmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bts.sio.azurimmo.model.Entreprise;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
