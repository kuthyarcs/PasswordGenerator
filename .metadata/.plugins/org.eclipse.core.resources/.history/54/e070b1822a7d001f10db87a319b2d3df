package pkg1.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pincode2Controller {
	@Autowired
	Pincode2Repo pincode2repo;
	@GetMapping("/pincode/getAll")
	public List<Pincode2Entity> getAllPincodes(){
		return pincode2repo.findAll();
	}
	@GetMapping("/pincode/get/{pin}")
	public List<Pincode2Entity> getPincode2(@PathVariable int pin){
		return pincode2repo.findPincode(pin);
		
		
	}
	
}
