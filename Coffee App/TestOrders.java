
public class TestOrders {
    public static void main(String[] args) {

    Order order1 = new Order("Ezzedin");
    Order order2 = new Order("Ahmad");
    Order order3 = new Order("Mahmoud");
    Order order4 = new Order("Hassoun");


    Item item1 = new Item("mocha",4.5);
    Item item2 = new Item("latte",2.4);
    Item item3 = new Item("drip coffee",2.5);
    Item item4 = new Item("cappuccino",5.0);


    CoffeeKiosk test = new CoffeeKiosk();
    test.addMenuItem("banana", 2.00 );
    test.addMenuItem("coffee", 1.50);
    test.addMenuItem("latte", 4.50);
    test.addMenuItem("capuccino", 3.00);
    test.addMenuItem("muffin", 4.00);
    test.newOrder();


        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item3);
        order1.getOrderTotal();
        order1.setReady(true);

        order2.addItem(item4);
        order2.addItem(item3);
        order2.getOrderTotal();

        order3.addItem(item2);
        order3.addItem(item2);
        order3.getOrderTotal();
        order3.setReady(true);
        
System.out.println(order1.getStatusMessage());
        order4.addItem(item4);
        order4.addItem(item2);
        order4.getOrderTotal();
        order4.setReady(true);
System.out.println("---------------------------------------------");
        order1.display();
        System.out.println("---------------------------------------------");

        order2.display();
        System.out.println("---------------------------------------------");

        order3.display();
        System.out.println("---------------------------------------------");

        order4.display();

}
}