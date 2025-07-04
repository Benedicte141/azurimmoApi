package bts.sio.azurimmo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "batiment")

public class Batiment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "adresse")
	private String adresse;

	public List<Appartement> getAppartements() {
		return appartements;
	}

	public void setAppartements(List<Appartement> appartements) {
		this.appartements = appartements;
	}

	@Column(name = "ville")
	private String ville;
	
	@OneToMany(mappedBy ="batiment")
	@JsonIgnore	
	private List<Appartement> appartements;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
