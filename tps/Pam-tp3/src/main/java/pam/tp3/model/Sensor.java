package pam.tp3.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Sensor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long sensorId;
	String name;
	int location;
	int type;

	@OneToMany(targetEntity=SensorData.class)
	List<SensorData> sensors;
	
	@ManyToOne(targetEntity=Parcelle.class)
	Parcelle parcelle;
	
	public Parcelle getParcelle() {
		return parcelle;
	}
	public void setParcelle(Parcelle parcelle) {
		this.parcelle = parcelle;
	}
	public Sensor()
	{}
	public Sensor(String name, int location, int type) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getSensorId() {
		return sensorId;
	}
	public List<SensorData> getSensors() {
		return sensors;
	}
	public void setSensors(List<SensorData> sensors) {
		this.sensors = sensors;
	}


}
