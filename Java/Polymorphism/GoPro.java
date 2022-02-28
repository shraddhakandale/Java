public class GoPro extends Camera {

    // Overriding method
    @Override
    public void savePicture() {
        System.out.println("Saving picture to cloud.");
    }
}
