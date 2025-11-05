public class Gorilla extends Mammals{
    
    public Gorilla(){
        super();
    }
    public void throwSomething(){
        super.setEnergylevel(super.getEnergylevel()-5);
                System.out.println("The gorilla has thrown an object");
    }
    public void eatBananas(){
        super.setEnergylevel(super.getEnergylevel() + 10);
                System.out.println("The gorilla's level of satisfaction");

    }
    public void climb(){
        super.setEnergylevel(super.getEnergylevel()-10);
                System.out.println("The gorilla has climbed a tree");

    }
}
