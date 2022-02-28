// Child class
public class Drone extends Camera {

    private int cameraAngle;
    private int flyingHeight;

    Drone() {
        // Fields inherited from Camera
        zoomLevel = 1.5f;
        isFlashOn = false;
        // Field added by Drone
        cameraAngle = 0;
        flyingHeight = 0;
    }

    public void setCameraAngle(int cameraAngle) {
        this.cameraAngle = cameraAngle;
    }

    public void setFlyingHeight(int flyingHeight) {
        this.flyingHeight = flyingHeight;
    }

    public void printDetails() {
        System.out.println("--------I am Drone---------");
        System.out.println("My zoom level is " + zoomLevel + ".");
        System.out.println("My flash is " + (isFlashOn ? "ON" : "OFF") + ".");
        System.out.println("My camera angle is " + cameraAngle + ".");
        System.out.println("My flying height is " + flyingHeight + ".");
        System.out.println("---------------------------");
    }
}
