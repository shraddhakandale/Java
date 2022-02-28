public class MainClass {

    public static void main(String args[]) {
        Camera camera = new Camera();
        // Accessing Flash through Camera object
        camera.setFlashOn(true);
        camera.clickPicture();
    }
}
