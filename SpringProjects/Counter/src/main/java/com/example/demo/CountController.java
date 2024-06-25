package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CountController {
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		
		if (session.getAttribute("counter")==null) {
			session.setAttribute("counter",0);
		}
		else {
			Integer count =(Integer) session.getAttribute("counter");
			count ++;
			session.setAttribute("counter",count);
			

		}
		return "index.jsp";
		
	}
	
	@RequestMapping("/your_server/counter2")
	public String counter2(HttpSession session) {
		if (session.getAttribute("counter")==null) {
			session.setAttribute("counter",0);
		}
		else {
			Integer count =(Integer) session.getAttribute("counter");
			count +=1;
			session.setAttribute("counter",count);
			
		}
		return "counter2.jsp";
	}
	@RequestMapping("/your_server/counter")
	public String counter() {
		
		return "counter.jsp";
	}
	
	@RequestMapping("/your_server/counter/delete")
	
	public String delete(HttpSession session) {
		session.invalidate();
		return "counter.jsp";
	}


}
