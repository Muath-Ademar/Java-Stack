import java.util.Date;

import javax.print.DocFlavor.STRING;
public class AlfredQuotes {
    
    public String basicGreeting() {
        int x=10;
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Welcome %s, Lovely to see you!", name);
        
    }
    public String guestGreeting(String name, String wine){
        return String.format(" Welcome %s, Lovely to see you!%s",name, wine);
    }
        
    public String dateAnnouncement() {
        Date Date = new Date();
        return "It is currently " + Date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } 
        if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }
    public String songChoice(String name){
        return String.format("What kind of music would you like %s ? ",name);
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        
        
}

