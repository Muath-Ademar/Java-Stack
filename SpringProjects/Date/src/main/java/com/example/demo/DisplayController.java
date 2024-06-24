package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class DisplayController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		
		String currentDate = new SimpleDateFormat ("EEEE, MMMM dd, yyyy").format(new Date());
		model.addAttribute("date", currentDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat format = new SimpleDateFormat ("h:mm a");
		String currentTime = ""+format.format(new Date());
		model.addAttribute("time", currentTime);
		return "time.jsp";
	}

}
