public class Camera {

    private int batteryLevel;

    public Camera() {
        batteryLevel = 50;
    }
    
    public void charge() {
        System.out.println("Connecting fresh, fully charged batteries.");
        batteryLevel = 100;
    }

    // Method overloading
    public void charge(int chargeToPercent) {
        if (chargeToPercent > batteryLevel && chargeToPercent <= 100) {
            System.out.println("Charging by plugging to power supply.");
            batteryLevel = chargeToPercent;
        } else {
            System.out.println("Invalid value given for chargeToPercent.");
        }
    }

    // Overridden method
    public void savePicture() {
        System.out.println("Saving picture to memory card.");
    }
}
