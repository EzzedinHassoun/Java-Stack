public class Bat extends Mammals {

    public Bat(){
        super(300);
    }
    
    public void fly(){
        super.setEnergylevel(super.getEnergylevel()-50);
                System.out.println("The bat is now airborne");
    }
    public void eatHumans(){
        super.setEnergylevel(super.getEnergylevel() + 25);
                System.out.println("The bat's satisfaction level");

    }
    public void attackTown(){
        super.setEnergylevel(super.getEnergylevel()-100);
                System.out.println("Describes the bat's attack");

    }
}
