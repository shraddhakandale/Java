public class MainClass {
    public static void main(String args[]) {
        Camera camera = new Camera();
        // camera can only click picture
        camera.clickPicture();
        // camera has only zoomLevel and isFlashOn
        camera.printDetails();

        VideoCamera videoCamera = new VideoCamera();
        // Video camera inherited behaviour of clicking picture from camera
        videoCamera.clickPicture();
        // Video camera can capture video as well
        videoCamera.captureVideo();
        // Video camera has zoomLevel, isFlashOn, framesPerSecond
        videoCamera.printDetails();

        Drone drone = new Drone();
        drone.setCameraAngle(30);
        drone.setFlyingHeight(45);
        // Inherited from parent
        drone.setZoomLevel(2.0f);
        // Drone has zoomLevel, isFlashOn, cameraAngle, flyingHeight
        drone.printDetails();
    }
}
