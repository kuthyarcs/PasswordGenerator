package pkg1.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGeneratorController3 {
	@GetMapping("/generatePasswords3")
	public List<Character> generatePasswords(){
		List<Character>list1=new ArrayList<>();
		List<Character>list2=new ArrayList<>();
		List<Character>list3=new ArrayList<>();
		for(int i=65;i<65+26;i++) {   //added A, B, C...Z
			char c1=(char)i;
			list1.add(c1);
		}
		return list1;
	}

		
		


}
