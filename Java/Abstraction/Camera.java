public class Camera {

    public void clickPicture() {
        detectLightRays();
        convertListToBits();
        savePicture();
        System.out.println("Picture clicked.");
    }

    // Private methods - hiding internal working
    private void detectLightRays() {
        // Detect light rays coming through lens
    }

    private void convertListToBits() {
        // Convert the light rays detected to bits
    }

    private void savePicture() {
        // Save picture to memory
    }
}
