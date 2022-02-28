// Data and methods that operate on the data are encapsulated together
public class Camera {

    private float zoomLevel;
    private float exposureLevel;
    private int framesPerSecond;
    private boolean isFlashOn;

    public void zoomIn() {
        if (zoomLevel < 4) {
            zoomLevel += 0.1;
        }
    }

    public void zoomOut() {
        if(zoomLevel > 0) {
            zoomLevel -= 0.1;
        }
    }

    public void setExposureLevel(float exposureLevel) {
        this.exposureLevel = exposureLevel;
    }

    public void setFramesPerSecond(int framesPerSecond) {
        this.framesPerSecond = framesPerSecond;
    }

    public void toggleFlashState() {
        isFlashOn = !isFlashOn;
    }
}
