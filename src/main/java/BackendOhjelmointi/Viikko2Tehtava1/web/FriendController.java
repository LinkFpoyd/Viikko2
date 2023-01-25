package BackendOhjelmointi.Viikko2Tehtava1.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import BackendOhjelmointi.Viikko2Tehtava1.domain.Kaveri;

@Controller
public class FriendController {
	
	ArrayList<Kaveri> kaverit = new ArrayList<>();
	
	@GetMapping("friendlist")
	public String listaaKaverit(Model model) {

		return "friendlist";
	}
	
	@PostMapping("friendlist")
	public String lisaaKaveri(@RequestParam (name="etunimi") String etunimi, @RequestParam (name="sukunimi") String sukunimi, Model model) {
		
		kaverit.add(new Kaveri(etunimi, sukunimi));
		
		model.addAttribute("kaverit", kaverit);
		
		return "friendlist";
	}

}
