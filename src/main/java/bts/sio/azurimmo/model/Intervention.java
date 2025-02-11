package bts.sio.azurimmo.model;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "intervention")


public class Intervention {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "description")
	private String description;
	
	@Column(name = "typeIntervention")
	private String typeIntervention;
	
	@Column(name = "dateIntervention")
	private LocalDate dateIntervention;
	
	@ManyToOne
	@JoinColumn(name = "appartement_id")
	private Appartement appartement;
	
	@ManyToOne
	@JoinColumn(name = "entreprise_id")
	private Entreprise entreprise;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeIntervention() {
		return typeIntervention;
	}

	public void setTypeIntervention(String typeIntervention) {
		this.typeIntervention = typeIntervention;
	}

	public LocalDate getDateIntervention() {
		return dateIntervention;
	}

	public void setDateIntervention(LocalDate dateIntervention) {
		this.dateIntervention = dateIntervention;
	}

	public Appartement getAppartement() {
		return appartement;
	}

	public void setAppartement(Appartement appartement) {
		this.appartement = appartement;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	
}
