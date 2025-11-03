public class DeviceTest {
    public static void main(String[] args) {
        Phone samsung = new Phone();
        samsung.makeCall();
        samsung.makeCall();
        samsung.makeCall();
        System.out.println(samsung.status());



        samsung.playGame();
        samsung.playGame();
        System.out.println(samsung.status());


        samsung.charge();
        System.out.println(samsung.status());



        samsung.displayBatteryLife();
    }
}
