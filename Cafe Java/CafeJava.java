public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        int dripCoffee = 30;
        int latte = 50;
        int cappuccino = 25;

        String customer1 = "Shatha";
        String customer2 = "Ahmad";
        String customer3 = "Sali";
        String customer4 = "Adam";

        boolean isReadyOrderAdam = false;
        boolean isReadyOrderSali = true;
        boolean isReadyOrderAhmad = true;
        boolean isReadyOrderShatha = false;

        System.out.println(generalGreeting + customer1);

        if (isReadyOrderAdam){
            System.out.println(customer4 + readyMessage + displayTotalMessage + ""+cappuccino);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        if (isReadyOrderAhmad){
            System.out.println(customer2 + readyMessage + displayTotalMessage + ""+latte);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        if (isReadyOrderShatha){
            System.out.println(customer1 + readyMessage + displayTotalMessage + ""+dripCoffee);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        if (isReadyOrderSali){
            System.out.println(customer3 + readyMessage + displayTotalMessage + ""+(mochaPrice + cappuccino));
        } else {
            System.out.println(customer3 + pendingMessage);
        }
    }
}
