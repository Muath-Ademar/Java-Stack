package com.axsos.hopperreceipt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Copper Wire";
        String itemName = "Copper wire";
        double price = 5.25;
        String desc = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("item_name", itemName);
        model.addAttribute("price", price);
        model.addAttribute("desc", desc);
        model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
    //...
    


}
