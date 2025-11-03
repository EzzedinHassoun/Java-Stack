public class Device {
    public int battery = 100;

    public void displayBatteryLife() {
        System.out.println("Battery: " + battery + "%");
    }

    public String status() {
        return "Current battery: " + battery + "%";
    }
}
