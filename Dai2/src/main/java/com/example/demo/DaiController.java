package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DaiController {
	@RequestMapping("/Dai")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/Dai/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/Dai/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/Dai/travel/{place}")
    public String first( @PathVariable("place") String place){
    	return "Congratulations!! you will soon travel to " + place;
    }
	
	@RequestMapping("/Dai/lotto/{num}")
    public String showLesson1(@PathVariable("num") int num){
		if (num % 2 == 0 ) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";	
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
    	
    }

}
