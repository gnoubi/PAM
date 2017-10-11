package pam.tp3.dataManagementServices;

import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pam.tp3.model.Address;
import pam.tp3.model.User;
import pam.tp3.repositories.PacelleRepository;

@Service
public class ParcelleManagement {

	@Autowired
	PacelleRepository parcelleRep;
	
	public void addParcelle(	User proprietaire, User maraicher, float surface,Address adresse)
	{
		
	}
	
}
