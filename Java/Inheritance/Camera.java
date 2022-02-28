// Parent class
public class Camera {
    // Fields that will e inherited by child classes
    protected float zoomLevel;
    protected boolean isFlashOn;

    public Camera() {
        zoomLevel = 1;
        isFlashOn = false;
    }

    // Methods that will be inherited by child classes
    public void setZoomLevel(float zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    private void toggleFlashState() {
        isFlashOn = !isFlashOn;
    }

    public void clickPicture() {
        System.out.println("Clicking picture.");
    }

    public void printDetails() {
        System.out.println("--------I am Camera--------");
        System.out.println("My zoom level is " + zoomLevel + ".");
        System.out.println("My flash is " + (isFlashOn ? "ON" : "OFF") + ".");
        System.out.println("---------------------------");
    }
}
