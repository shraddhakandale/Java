// Blueprint of cameras
public class Camera {
    // Fields - will represent state of objects
    private boolean isFlashOn;
    private int framesPerSecond;
    private float zoomLevel;

    // Constructors
    // Default constructor
    public Camera() {
        isFlashOn = false;
        framesPerSecond = 60;
        zoomLevel = 1;
    }

    // Parameterized constructor
    public Camera(boolean isFlashOn, int framesPerSecond, float zoomLevel) {
        this.isFlashOn = isFlashOn;
        this.framesPerSecond = framesPerSecond;
        this.zoomLevel = zoomLevel;
    }

    // Copy constructor
    public Camera(Camera camera) {
        isFlashOn = camera.isFlashOn;
        framesPerSecond = camera.framesPerSecond;
        zoomLevel = camera.zoomLevel;
    }

    // Methods - define behaviours of future objects
    public void clickPicture() {
        // Click picture
        System.out.println("Clicking picture...");
    }

    public void captureVideo() {
        // Capture video
        System.out.println("Capturing video...");
    }

    public void toggleFlash() {
        isFlashOn = !isFlashOn;
    }

    public void setFramesPerSecond(int framesPerSecond) {
        this.framesPerSecond = framesPerSecond;
    }

    public void setZoomLevel(float zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public void printDetails() {
        System.out.println("-----------I am a Camera object-----------");
        System.out.println("My flash is " + (isFlashOn ? "ON" : "OFF") + ".");
        System.out.println("My frames per second is " + framesPerSecond + ".");
        System.out.println("My zoom level is " + zoomLevel + ".");
        System.out.println("My identity is " + this + ".");
        System.out.println("------------------------------------------");
    }

    public static void main(String args[]) {
        // Objects of camera
        Camera camera1 = new Camera();
        Camera camera2 = new Camera(false, 80, 1.5f);

        // Executing behaviours
        camera1.setFramesPerSecond(70);
        camera1.toggleFlash();

        camera1.printDetails();
        camera2.printDetails();
    }
}
