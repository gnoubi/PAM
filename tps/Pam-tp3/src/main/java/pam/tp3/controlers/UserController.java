package pam.tp3.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pam.tp3.dataManagementServices.IUserManagment;
import pam.tp3.model.Address;
import pam.tp3.model.User;

@Controller
@RequestMapping("users")
public class UserController {
	@Autowired
	private IUserManagment userManager;

	@RequestMapping("adduser")
	public String addUser(@RequestParam(value="firstname", required=false) String firstname, @RequestParam(value="lastname", required=false) String lastname,@RequestParam(value="choosenAddress", required=false) Integer idAddress, Model model)
	{
		if(firstname != null && lastname != null)
		{
			Address addr = userManager.getAddress(idAddress.longValue());
			userManager.addUser(firstname, lastname,addr);
		}
		Iterable<Address> alladdr =userManager.getAllAddresses();
		model.addAttribute("addresses",alladdr);
		Iterable<User> allUser =userManager.getAllUsers();
		model.addAttribute("users",allUser);
		return "userView";
	}

	@RequestMapping("addaddress")
	public String addUser(@RequestParam(value="numero", required=false) String numero, 
			@RequestParam(value="rue", required=false) String rue,
			@RequestParam(value="ville", required=false) String ville,
			@RequestParam(value="codePostal", required=false) String codePostal,Model model)
	{
		if(codePostal != null && ville != null)
		{
			userManager.addAddress(numero, rue, ville, codePostal);
			Iterable<Address> allAdress =userManager.getAllAddresses();
			
			model.addAttribute("addresses",allAdress);
		}
		return "addressView";
	}


}
