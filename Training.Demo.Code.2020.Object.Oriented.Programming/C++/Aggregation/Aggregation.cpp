#include <iostream>

using namespace std;
class MemoryCard {

private:
  int numPicturesSaved;

public:
  MemoryCard() { numPicturesSaved = 0; }

  void addPicture() { numPicturesSaved++; }

  int getNumPicturesSaved() { return numPicturesSaved; }
};

class Camera {

private:
  // Camera is associated with a memory card
  MemoryCard memoryCard;

public:
  void clickPicture() { memoryCard.addPicture(); }

  ~Camera() {
    // Destruction of the camera does not cause the destruction of the memory
    // card.
  }
};

int main(void) {
  Camera camera;
  camera.clickPicture();
  camera.~Camera();

  return 0;
}