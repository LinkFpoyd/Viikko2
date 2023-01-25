package BackendOhjelmointi.Viikko2Tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Viikko2Tehtava1Controller {

		
		@GetMapping("hello")
		public String tervehdiKayttajaa(@RequestParam(name="nimi") String name,
				@RequestParam(name="ika") int age, Model model) {
			
			model.addAttribute("nimi", name);
			model.addAttribute("ika", age);
			return "hello";
		}

	}



