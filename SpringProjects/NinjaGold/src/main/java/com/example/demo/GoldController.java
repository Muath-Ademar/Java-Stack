package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller

public class GoldController {
	

ArrayList<String> activity = new ArrayList <String>();
//try to use models to save data

		@RequestMapping("/dash")
	public String index(HttpSession session, Model model) {
		if (session.getAttribute("counter") == null){
			session.setAttribute("counter", 0);
			session.setAttribute("activities", activity);
		}

		
		
		int count = (int) session.getAttribute("counter");
		

		return "index.jsp";
	}

	@PostMapping("/action")
	public String proccessForm( 
        @RequestParam(value="box") String box, Model model,
        HttpSession session
        ) {
		
					int count = (int) session.getAttribute("counter");
					
					SimpleDateFormat date = new SimpleDateFormat ("MMMM d y h:mm a");
					

            switch (box) {
                case "Farm":
                    {
						int min = 10;
						int max = 20;
                        int a = (int)(Math.random()*(max-min+1)+min);
                        count+=a;
                        session.setAttribute("counter", a);
                         activity.add(0, "you entered a farm and earned " + a + " Gold. submission at: " + date.format(new Date()));
                        
                		
                        break;
                    }
                case "Cave":
                    {
						int min = 5;
						int max = 10;
                        int a = (int)(Math.random()*(max-min+1)+min);
                        count+=a;
                        session.setAttribute("counter", a);
                         activity.add(0, "you entered a Cave and earned " + a + " Gold. submission at: " + date.format(new Date()));
                        
                        break;
                    }
                case "House":
                    {
						int min = 2;
						int max = 5;
                        int a = (int)(Math.random()*(max-min+1)+min);
                        count+=a;
                        session.setAttribute("counter", a);
                          activity.add(0, "you entered a House and earned " + a + " Gold. submission at: " + date.format(new Date()));
                        
                        break;
                    }
                case "Quest":
                    {
						int min = -50;
						int max = 50;
                        int a = (int)(Math.random()*(max-min+1)+min);
                        count+=a;
                        session.setAttribute("counter", a);
                        if(a>0) {
                        	 activity.add(0, "you've completed a quest and earned " + a + " Gold. submission at: " + date.format(new Date()));
                        	
                        }
                        else {
                        		 activity.add(0, "you've faild a quest and lost " + a + " Gold. Ouch. submission at: " + date.format(new Date()));
                        	
                        }
                        
                        break;
                    }
                default:
                	
                    break;
            }
            
            session.setAttribute("activities", activity);
            session.setAttribute("counter", count);
            
		
		return "redirect:/dash";
	}
	
	

}
