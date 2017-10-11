package pam.tp3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pam.tp3.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>  {
	public User findByNomAndPrenom(String nom, String prenom);
}
