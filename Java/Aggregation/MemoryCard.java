public class MemoryCard {
    private int numPicturesSaved;

    public MemoryCard() {
        numPicturesSaved = 0;
    }

    public void addPicture() {
        numPicturesSaved++;
    }

    public int getNumPicturesSaved() {
        return numPicturesSaved;
    }
}
