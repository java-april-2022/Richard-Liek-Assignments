import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
    //     // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello %s, how was your day?", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("Today's date is %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") > -1) {
            return "She's kind of cooler than I am. Is there anything I can do for you?";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "How may I help you?";
        }
        return "okay byeee.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
