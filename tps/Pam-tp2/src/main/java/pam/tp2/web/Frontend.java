package pam.tp2.web;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Scope("session")
public class Frontend {
	private static Logger logger = Logger.getLogger(Frontend.class);
	int nbConnexion = 0;
	
	public Frontend()
	{
		super();
		logger.info("initialize bean");
	}
	
	
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("connexion", nbConnexion);
        nbConnexion++;
        return "greeting";
    }

}
