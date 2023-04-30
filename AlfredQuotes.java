import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // String greeting = String.format("Hello %s.  Lovely to see you", name);
        return String.format("Hello %s.  Lovely to see you. How are you today?", name);
    }
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }
    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("H");
        String hourstr = dateFormat.format(date);
        int hour = Integer.parseInt(hourstr);
        if (hour < 12) {
            return "Good morning!  How are you today?";
        }
        else if (hour < 18) {
            return "Good afternoon!  How are you today?";
        }
        else {
            return "Good evening!  How are you today?";
        }
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        if (alexis != -1) {
        return "Right away, Sir.  She certainly is not sophisticated enough for that.";
        }
        else if (alfred != -1 ) {
            return "At your service.  As you wish, naturally.";
        }
        else {
            return "Right.  And with that I shall retire.";
        }
    }
    public String angryResponse(String question) {
        if (question.length() > 15) {
            String message = "I will look into it as best I can.";
            return message.toUpperCase();
        }
        else {
            String message = "I will look into it as best I can.";
            return message;
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

