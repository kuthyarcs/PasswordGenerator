package pkg1.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGeneratorController2 {
	@GetMapping("/generatePasswords2")
	public List<String>generatePasswords() {
		List<String>list1=new ArrayList<>();
		list1.add("ab12458Azv");
		list1.add("Pecj582aYr");
		return list1;
	}
	

}
