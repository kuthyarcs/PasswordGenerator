package pkg1.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGeneratorController1 {
	@GetMapping("/generatePasswords1")
	public String generatePasswords(){
		return "Afb234s3";
	}

}
