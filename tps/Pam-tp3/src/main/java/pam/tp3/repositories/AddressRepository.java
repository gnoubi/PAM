package pam.tp3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pam.tp3.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long>  {
}
