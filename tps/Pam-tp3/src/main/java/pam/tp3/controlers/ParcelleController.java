package pam.tp3.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pam.tp3.dataManagementServices.IUserManagment;

@Controller
@RequestMapping("parcelles")
public class ParcelleController {
	@Autowired
	private IUserManagment userManager;
	@RequestMapping("addparcelle")
	public String addUser(@RequestParam(value="proprietaire", required=false) Integer idProp, @RequestParam(value="exploitant", required=false) Integer idExploitant,@RequestParam(value="choosenAddress", required=false) Integer idAddress, @RequestParam(value="information", required=false) String information, @RequestParam(value="surface", required=false) Float surface, Model model)
	{
	
		return "";
	}
}
