// Abstract class
abstract public class Camera {

    public void clickPicture() {
        System.out.println("Clicking picture.");
        savePicture();
    }

    // savePicture() is only declared. It does not have definition.
    public abstract void savePicture();
}
