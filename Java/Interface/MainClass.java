public class MainClass {

    public static void main(String args[]) {
        Button button = new Button();
        button.registerListener(new Shutter());

        button.clickPicture();
    }
}
