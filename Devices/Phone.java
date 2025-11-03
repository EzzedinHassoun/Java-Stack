public class Phone extends Device {

    public void makeCall() {
        if (this.battery >= 5) {
            this.battery -= 5;
        } else {
            System.out.println("Your phone battery has died");
        }
    }

    public void playGame() {
        if (this.battery >= 20) {
            this.battery -= 20;
        } else {
            System.out.println("Your phone battery has died");
        }
    }

    public void charge() {
        if (this.battery <= 50) {
            this.battery += 50;
        } else {
            System.out.println("Your phone's battery is more than 50%, play some games");
        }
    }
}
