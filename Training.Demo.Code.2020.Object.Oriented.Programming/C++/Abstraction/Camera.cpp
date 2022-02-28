#include<iostream>

using namespace std;
class Camera {

public:
	void clickPicture() {
        detectLightRays();
        convertListToBits();
        savePicture();
        cout<<"Picture clicked."<<endl;
    }

    // Private methods - hiding internal working
private:
	void detectLightRays() {
        // Detect light rays coming through lens
    }

    void convertListToBits() {
        // Convert the light rays detected to bits
    }

    void savePicture() {
        // Save picture to memory
    }
};

int main(void) {
    Camera camera;
    // User only knows camera can click picture. User does not know how it does that.
    camera.clickPicture();

    return 0;
}