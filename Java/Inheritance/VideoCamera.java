// Child class
public class VideoCamera extends Camera {

    private int framesPerSecond;

    VideoCamera() {
        // Fields inherited from Camera
        zoomLevel = 1.5f;
        isFlashOn = false;
        // Field added by VideoCamera
        framesPerSecond = 65;
    }

    public void setFramesPerSecond(int framesPerSecond) {
        this.framesPerSecond = framesPerSecond;
    }

    public void captureVideo() {
        System.out.println("Capturing video.");
    }

    @Override
    public void printDetails() {
        System.out.println("-----I am Video Camera-----");
        System.out.println("My zoom level is " + zoomLevel + ".");
        System.out.println("My flash is " + (isFlashOn ? "ON" : "OFF") + ".");
        System.out.println("My frames per second is " + framesPerSecond + ".");
        System.out.println("---------------------------");
    }
}
