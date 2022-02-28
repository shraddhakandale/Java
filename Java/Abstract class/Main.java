public class Main {

    public static void main(String args[]) {
        // Objects can be created only for concrete classes, not for abstract classes
        AnalogCamera analogCamera = new AnalogCamera();
        DSLR dslr = new DSLR();

        analogCamera.savePicture();
        dslr.savePicture();
    }
}
