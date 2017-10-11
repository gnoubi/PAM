package pam.tp3.dataManagementServices;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pam.tp3.model.Address;
import pam.tp3.model.User;
import pam.tp3.repositories.AddressRepository;
import pam.tp3.repositories.UserRepository;

@Service
public class UserManagment implements IUserManagment {
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AddressRepository addressRepo;
	
	public UserManagment()
	{	}

	public User addUser(String firstname, String name, Address addr )
	{
		User usr = addUser(firstname,  name);
		usr.setAddress(addr);
		return userRepo.save(usr);
	}
	
	public Address addAddress(String numero, String rue, String ville, String codepostal)
	{
		Address addr = new Address( numero,  rue,  ville,  codepostal);
		return addressRepo.save(addr);
	}
	
	public Iterable<User> getAllUsers()
	{
		return userRepo.findAll();
	}
	public Iterable<Address> getAllAddresses()
	{
		return addressRepo.findAll();
	}

	public Address getAddress(long addressID)
	{
		return addressRepo.findOne(addressID);
	}

	
	@Override
	public User addUser(String firstname, String name) {
		User usr = new User(name, firstname);
		return userRepo.save(usr);
	}
}
