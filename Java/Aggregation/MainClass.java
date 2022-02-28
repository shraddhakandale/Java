public class MainClass {

    public static void main(String args[]) {
        Camera camera = new Camera();
        MemoryCard memoryCard = new MemoryCard();

        camera.attachMemoryCard(memoryCard);
        camera.clickPicture();
        System.out.println("Number of pictures saved:" + memoryCard.getNumPicturesSaved());

        camera = null;

        // Memory card still exists without the camera
        System.out.println("Number of pictures saved:" + memoryCard.getNumPicturesSaved());
    }
}
