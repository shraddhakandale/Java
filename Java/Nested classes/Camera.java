public class Camera {

    private String name;

    public Camera(String name) {
        this.name = name;
    }

    // Inner class
    private class Battery {
        private int batteryPercent;

        public Battery() {
            batteryPercent = 50;
        }

        public void discharge() {
            if (batteryPercent > 0) {
                // Can directly access member of outer class.
                System.out.println("Discharging battery of " + name + ".");
                batteryPercent--;
            } else {
                System.out.println("Charge over for battery of " + name + ".");
            }
        }

        public void charge() {
            // Can directly access member of outer class.
            System.out.println("Charging battery for " + name + ".");
            batteryPercent = 100;
        }
    }

    // Static class
    static class Tripod {
        private int heightCentimeters;
        private int horizontalAngle;
        private int verticalAngle;

        public Tripod() {
            heightCentimeters = 100;
            horizontalAngle = 0;
            verticalAngle = 0;
        }

        public void adjustTripod(int heightCentimeters, int horizontalAngle, int verticalAngle) {
            this.heightCentimeters = heightCentimeters;
            this.horizontalAngle = horizontalAngle;
            this.verticalAngle = verticalAngle;
        }

        public void attachCamera(Camera camera) {
            // Cannot directly access member of outer class. Need an object of outer class.
            System.out.println("Attaching a camera" + camera.name + ".");
        }

        public void detachCamera(Camera camera) {
            // Cannot directly access member of outer class. Need an object of outer class.
            System.out.println("Detaching " + camera.name + ".");
        }
    }

    public static void main(String args[]) {
        Camera canon = new Camera("Canon");
        Camera goPro = new Camera("GoPro");

        // Object of battery is associated with a Camera object
        Battery cannonBattery = canon.new Battery();
        Battery goProBattery = goPro.new Battery();
        System.out.println("-----Cannon battery-----");
        cannonBattery.discharge();
        System.out.println("------------------------");
        System.out.println("-----GoPro battery------");
        goProBattery.charge();
        System.out.println("------------------------");

        // Associated with outer class, not an object of outer class
        Tripod tripod = new Camera.Tripod();
        System.out.println("---------Tripod---------");
        tripod.attachCamera(canon);
        tripod.detachCamera(canon);
        tripod.attachCamera(goPro);
        tripod.detachCamera(goPro);
        System.out.println("------------------------");
    }
}
