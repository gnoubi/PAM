package pam.tp3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SensorData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int dataId;
}
