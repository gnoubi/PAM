package pam.tp3.dataManagementServices;

import pam.tp3.model.Address;
import pam.tp3.model.User;

public interface IUserManagment {
	public Iterable<User> getAllUsers();
	public Iterable<Address> getAllAddresses();
	public Address getAddress(long addressID);
	public User addUser(String firstname, String name, Address addr );
	public User addUser(String firstname, String name);
	public Address addAddress(String numero, String rue, String ville, String codepostale);

}
