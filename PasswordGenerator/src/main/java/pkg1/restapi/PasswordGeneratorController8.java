package pkg1.restapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGeneratorController8 {
	
	public String generateSinglePassword() {
		List<String>list1=new ArrayList<>();
		List<String>list2=new ArrayList<>();
		List<String>list3=new ArrayList<>();
		List<String>list4=new ArrayList<>();
		char c1;
		char c2;
		String s3="";
		String s4="";
		int r1=0;
		for(int i=0;i<26;i++) {
			c1=(char)(65+i);
			c2=(char)(97+i);
			list1.add(String.valueOf(c1));
			list2.add(String.valueOf(c2));
		}
		for(int i=0;i<9;i++) {
			s3=String.valueOf(i);
			list3.add(s3);
		}
		list4.addAll(list1);
		list4.addAll(list2);
		list4.addAll(list3);
		Random rand1=new Random();
		r1=rand1.nextInt(0,25);
		s4=s4+String.valueOf(list1.get(r1));
		
		r1=rand1.nextInt(0,25);
		s4=s4+String.valueOf(list2.get(r1));
		
		r1=rand1.nextInt(0,9);
		s4=s4+String.valueOf(list3.get(r1));
		 
		for(int i=0;i<5;i++) {
			r1=rand1.nextInt(0,61);  //26+26+10=62 characters
			s4=s4+list4.get(r1);
		}
		return s4;
	}
	@GetMapping("/generatePasswords8")
	public List<String>generatePasswords(){
		List<String>list5=new ArrayList<>();
		for(int i=0;i<20;i++) {
			list5.add(generateSinglePassword());
		}
		return list5; //returns list of 20 passwords
		 
	}

}
