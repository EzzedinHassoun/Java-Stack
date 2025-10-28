public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        int cocktail = 30;
        int milkShake = 20;
        int cappuccino = 25;
        // Customer name variables (add yours below)
        String customer1 = "Ezzedin";
        String customer2 = "Mahmoud";
        String customer3 = "Sudqi";
        String customer4 = "Hassoun";
        String customer5 = "Ahmad";

        
        // Order completions (add yours below)
        boolean isReadyOrderAhmad = true;
        boolean isReadyOrderSudqi = true;
        boolean isReadyOrderMahmoud = true;
        boolean isReadyOrderHassoun = true;
        boolean isReadyOrderEzzedin = true;
                            
        System.out.println(generalGreeting + customer1);
        if (isReadyOrderHassoun){
            System.out.println(customer4 + readyMessage + displayTotalMessage +""+cappuccino );
        }else{
            System.out.println(customer4 + pendingMessage);
        }
        if (isReadyOrderMahmoud){
            System.out.println(customer2 + readyMessage + displayTotalMessage +""+milkShake );
        }else{
            System.out.println(customer2 + pendingMessage);
        }
        if (isReadyOrderSudqi){
            System.out.println(customer3 + readyMessage + displayTotalMessage +""+(mochaPrice + milkShake));
        }else{
            System.out.println(customer3 + pendingMessage);
        }
        if (isReadyOrderEzzedin){
            System.out.println(customer1 + readyMessage + displayTotalMessage +""+cocktail );
        }else{
            System.out.println(customer1 + pendingMessage);
        }
        if (isReadyOrderAhmad){
            System.out.println(customer5 + readyMessage + displayTotalMessage +""+(mochaPrice+cappuccino));
        }else{
            System.out.println(customer5 + pendingMessage);
        }
    }
}