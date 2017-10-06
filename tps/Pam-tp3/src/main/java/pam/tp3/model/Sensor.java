package pam.tp3.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Sensor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int sensorId;
	String name;
	int location;
	int type;

	@OneToMany
	@JoinColumn(name="sensorId")
	Collection<SensorData> data;
	
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
	public int getSensorId() {
		return sensorId;
	}	
	
}
