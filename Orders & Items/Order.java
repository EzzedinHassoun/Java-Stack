import java.util.ArrayList;

public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items = new ArrayList<Item>();

    public void findTotal() {
        total = 0;
        for (Item item : items) {
            total += item.price;
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
