package BackendOhjelmointi.Viikko2Tehtava1.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import BackendOhjelmointi.Viikko2Tehtava1.domain.Student;

@Controller
public class StudentController {

		
		@GetMapping("studentlist")
		public String listaaOppilaat(Model model) {
			
			ArrayList<Student> students = new ArrayList<>();
			
			students.add(new Student("Krista", "Kiuru"));
			students.add(new Student("Maria", "Ohisalo"));
			students.add(new Student("Sale", "Niinistö"));
			
			model.addAttribute("students", students);

			return "studentlist";
		}

	}



