package pam.tp3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pam.tp3.model.Parcelle;

@Repository
public interface PacelleRepository extends CrudRepository<Parcelle, Long>  {
	
}
