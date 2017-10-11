package pam.tp3.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	String information;
	
	@ManyToOne
	Address adresse;
	
	@OneToMany
	List<Sensor> sensors;
	
	
	public long getParcelleID() {
		return parcelleID;
	}
	public void setParcelleID(long parcelleID) {
		this.parcelleID = parcelleID;
	}
	public User getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(User proprietaire) {
		this.proprietaire = proprietaire;
	}
	public User getMaraicher() {
		return maraicher;
	}
	public void setMaraicher(User maraicher) {
		this.maraicher = maraicher;
	}
	public float getSurface() {
		return surface;
	}
	public void setSurface(float surface) {
		this.surface = surface;
	}
	public Address getAdresse() {
		return adresse;
	}
	public void setAdresse(Address adresse) {
		this.adresse = adresse;
	}
	public List<Sensor> getSensors() {
		return sensors;
	}
	public void setSensors(List<Sensor> sensors) {
		this.sensors = sensors;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	
	
}
