package pkg1.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGeneratorController5 {
	@GetMapping("/generatePasswords5")
	public String generatePasswords(){
		List<Character>list1=new ArrayList<>();
		List<Character>list2=new ArrayList<>();
		List<String>list3=new ArrayList<>();
		List<String>list4=new ArrayList<>();
		char c1;
		char c2;
		String s3="";
		String s4="";
		for(int i=0;i<26;i++) {
			c1=(char)(65+i);
			c2=(char)(97+i);
			list1.add(c1);
			list2.add(c2);
		}
		for(int i=0;i<9;i++) {
			s3=String.valueOf(i);
			list3.add(s3);
		}
		s4=s4+String.valueOf(list1.get(0));
		s4=s4+String.valueOf(list2.get(0));
		s4=s4+String.valueOf(list3.get(0));
		return s4;   //Password with length 3 -  Aa0
	}

}
