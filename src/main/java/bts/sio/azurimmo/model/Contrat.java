package bts.sio.azurimmo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "contrat")

public class Contrat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "dateEntree")
	private LocalDate dateEntree;
	
	@Column(name = "dateSortie")
	private LocalDate dateSortie;
	
	@Column(name = "montantLoyer")
	private float montantLoyer;
	
	@Column(name = "montantCharges")
	private float montantCharges;
	
	@Column(name = "statut")
	private String statut;
	
	@ManyToOne
	@JoinColumn(name = "locataire_id")
	@JsonManagedReference
	private Locataire locataire;
	
	@ManyToOne
	@JoinColumn(name = "appartement_id")
	//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@JsonManagedReference
	private Appartement appartement ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(LocalDate dateEntree) {
		this.dateEntree = dateEntree;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	public float getMontantLoyer() {
		return montantLoyer;
	}

	public void setMontantLoyer(float montantLoyer) {
		this.montantLoyer = montantLoyer;
	}

	public float getMontantCharges() {
		return montantCharges;
	}

	public void setMontantCharges(float montantCharges) {
		this.montantCharges = montantCharges;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Locataire getLocataire() {
		return locataire;
	}

	public void setLocataire(Locataire locataire) {
		this.locataire = locataire;
	}

	public Appartement getAppartement() {
		return appartement;
	}

	public void setAppartement(Appartement appartement) {
		this.appartement = appartement;
	}
	
	
}
