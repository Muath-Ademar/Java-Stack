package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
	
    @RequestMapping("/")
    public String name(@RequestParam(value="name", required = false) String first
    	,@RequestParam(value = "last_name", required = false) String last, @RequestParam(value = "last_name", required = false ) Integer times ){
    	if (first  == null ) {
    		return "Hello There"; 
    	}
    	else if(last == null) {
    		return "Hello" + first;
    	}
    	else {
    		return "Hello: " + first + last;
    	}
        
    }
}

		

