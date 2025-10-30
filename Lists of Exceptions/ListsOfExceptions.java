import java.util.ArrayList;

public class ListsOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("hello world");
        myList.add("Ezzedin");
        myList.add("Hassoun");
        myList.add(31);
        myList.add("Goodbye World");
        myList.add(30.50);
        myList.add(true);

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted value:" + castedValue);
            } catch (ClassCastException e) {
                System.out.println(" Cannot cast \"" + myList.get(i) + "\" to Integer.");
            }
            
        }
    }
}
