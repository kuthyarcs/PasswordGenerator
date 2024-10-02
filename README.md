 **Password Generator**   
 [Controller1](https://github.com/kuthyarcs/PasswordGenerator/blob/main/PasswordGenerator/src/main/java/pkg1/restapi/PasswordGeneratorController1.java)   
 Generate a hardcoded String of 8 characters as Password
 ```
 public String generatePasswords(){
		return "Afb234s3";
```

[Controller2](https://github.com/kuthyarcs/PasswordGenerator/blob/main/PasswordGenerator/src/main/java/pkg1/restapi/PasswordGeneratorController2.java)   
Generate 2 passwords, add it an ArrayList   
```
@GetMapping("/generatePasswords2")
	public List<String>generatePasswords() {
		List<String>list1=new ArrayList<>();
		list1.add("ab12458Azv");
		list1.add("Pecj582aYr");
		return list1;
	}
```

[Controller3](https://github.com/kuthyarcs/PasswordGenerator/blob/main/PasswordGenerator/src/main/java/pkg1/restapi/PasswordGeneratorController3.java)   
Create 3 lists for uppercase, lowercase and numbers, return uppercase only   
```
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
```

[Controller4](https://github.com/kuthyarcs/PasswordGenerator/blob/main/PasswordGenerator/src/main/java/pkg1/restapi/PasswordGeneratorController4.java)   
Return lowercase list {a, b, c....}   
```
@GetMapping("/generatePasswords4")
	public List<Character>generatePasswords(){
		List<Character>list1=new ArrayList<>();
		List<Character>list2=new ArrayList<>();
		List<Character>list3=new ArrayList<>();
		char c1;
		char c2;
		char c3;
		for(int i=0;i<26;i++) {
			c1=(char)(65+i);
			c2=(char)(97+i);
			list1.add(c1);
			list2.add(c2);
		}
		for(int i=0;i<9;i++) {
			c3=(char)(i);
			list3.add(c3);
		}
		return list2;     //returns a, b, c, ...z
	}
```

[Controller5](https://github.com/kuthyarcs/PasswordGenerator/blob/main/PasswordGenerator/src/main/java/pkg1/restapi/PasswordGeneratorController5.java)   
Create a 3 letter password with 1 upper, 1 lower, 1 number - eg Aa0   
```
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
```

[Controller6](https://github.com/kuthyarcs/PasswordGenerator/blob/main/PasswordGenerator/src/main/java/pkg1/restapi/PasswordGeneratorController6.java)   
Choose a random uppercase, a random lowercase, a random number - eg Sz4   
```
@GetMapping("/generatePasswords6")
	public String generatePasswords(){
		List<Character>list1=new ArrayList<>();
		List<Character>list2=new ArrayList<>();
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
			list1.add(c1);
			list2.add(c2);
		}
		for(int i=0;i<9;i++) {
			s3=String.valueOf(i);
			list3.add(s3);
		}
		Random rand1=new Random();
		r1=rand1.nextInt(0,25);
		s4=s4+String.valueOf(list1.get(r1));
		
		r1=rand1.nextInt(0,25);
		s4=s4+String.valueOf(list2.get(r1));
		
		r1=rand1.nextInt(0,9);
		s4=s4+String.valueOf(list3.get(r1));
		return s4;  
	}
```

[Controller7](https://github.com/kuthyarcs/PasswordGenerator/blob/main/PasswordGenerator/src/main/java/pkg1/restapi/PasswordGeneratorController7.java)   
Create list with (26+26+10) =62 characters. Create 8 digit password, with first 3 being upper case, lower case, number, remaining can be any character from a character set of 62 chars.    
```
@GetMapping("/generatePasswords7")
	public String generatePasswords(){
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
```

[Controller8](https://github.com/kuthyarcs/PasswordGenerator/blob/main/PasswordGenerator/src/main/java/pkg1/restapi/PasswordGeneratorController8.java)      
Create 20 passwords each of 8 characters   
```
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
```