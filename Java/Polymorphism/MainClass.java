public class MainClass {

    public static void main(String args[]) {
        Camera camera = new Camera();
        // Static/compile time polymorphism
        camera.charge(75);
        camera.charge();

        Camera goPro = new GoPro();
        // Dynamic/runtime polymorphism
        camera.savePicture();
        goPro.savePicture();
    }
}
