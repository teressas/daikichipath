package com.teressas.daikichipath;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/daikichi")


public class DaikichipathController {
	
	@GetMapping("")
	public String index() {
		return "Welcome";
	}
	
	@GetMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@GetMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@GetMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city;
	}
	
	@GetMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int num) {
		
		if(num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
					
		} 
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	}
	



}
