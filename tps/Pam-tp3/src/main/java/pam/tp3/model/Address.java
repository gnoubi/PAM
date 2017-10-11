package pam.tp3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idadresse;
	private String numero;
	private String rue;
	private String ville;
	private String codePostal;
	
	public Address() {}
	
	public Address(String numero, String rue, String ville, String codepostal) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codepostal;
	}
	public long getIdadresse() {
		return idadresse;
	}
	public void setIdadresse(long idadresse) {
		this.idadresse = idadresse;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codepostal) {
		this.codePostal = codepostal;
	}
	
	
}
