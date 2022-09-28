import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String greeting = String.format("Hello, %s. Lovely to see you.", name);
        return greeting;
    }
    // Ninja Bonus Version
    public String guestGreeting(String name, String dayPeriod) {
        String greeting = String.format("Good %s, %s. Lovely to see you.", name, dayPeriod);
        return greeting;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        // Checks if Alexis is in the string
        int alexisIsInValue = conversation.indexOf("Alexis");
        // Checks if Alfred is in the string
        int alfredisInValue = conversation.indexOf("Alfred");
        // Sensei Bonus - If he doesn't say thank you
        int appreciationIsInValue = conversation.indexOf( "thank you");
        // If Alexis is in the string
        if (alexisIsInValue > 0){
            if (appreciationIsInValue < 0){
                return "Right away, sir. She certainly isn't sophisticated enough for that. Ohh AND YOUR WELCOME BRUCE!";
            }
            else {
                return "Right away, sir. She certainly isn't sophisticated enough for that.";
            }
        }
        // If Alfred is in the string
        else if (alfredisInValue > 0){
            if (appreciationIsInValue < 0){
                return "At your service. As you wish, naturally. HMM MAYBE A THANKS OR THANK YOU NEXT TIME";
            }
            else{
                return "At your service. As you wish, naturally.";
            }
        }
        // If neither Alexis or Alfred is in the string
        else {
            if (appreciationIsInValue < 0){
                return "Right. And with that I shall retire. NO WORRIES SIR I DON'T NEED A THANK YOU";
            }
            else{
                return "Right. And with that I shall retire.";
            }
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

