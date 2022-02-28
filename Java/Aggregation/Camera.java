public class Camera {

    // Camera is associated with a memory card
    private MemoryCard memoryCard;

    public void attachMemoryCard(MemoryCard memoryCard) {
        // Storing a reference of a Memory card object
        this.memoryCard = memoryCard;
    }

    public void clickPicture() {
        memoryCard.addPicture();
    }
}
