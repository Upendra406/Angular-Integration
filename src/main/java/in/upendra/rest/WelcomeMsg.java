package in.upendra.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Hello....Welcome To My World!";
	}

}
