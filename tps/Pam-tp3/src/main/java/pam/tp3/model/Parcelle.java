package pam.tp3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Parcelle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long parcelleID;
	
	@ManyToOne
	User proprietaire;
	@ManyToOne
	User maraicher;
	float surface;
	
	
}
