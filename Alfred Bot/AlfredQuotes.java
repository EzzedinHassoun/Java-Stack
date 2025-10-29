import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    // Date date = new Date();
    
    public String guestGreeting(String name, int number) {
        // YOUR CODE HERE
        return String.format("Hello %s, how are you? Your number is %d.", name, number);

    }
    public Integer guestGreeting(Integer  num) {
        return (num);
    }
    public Double  guestGreeting(Double n) {
        return (n);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Current date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis")>-1){
             System.out.println(conversation);
            return("Right away, sir. She certainly isn't sophisticated enough for that");
        }else if (conversation.indexOf("Alfred")>-1){
            return "At your service. As you wish, naturally.";
        }else{

            return "no he is not thare";
        }
    }
    
}