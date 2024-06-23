package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
	
    @RequestMapping("/")
    public String name(@RequestParam(value="name", required = false) String first, String last ) {
    	if (first  == null && last == null) {
    		return "Hello There"; 
    	}
        return "Hello: " + first + last;
    }
}

		

