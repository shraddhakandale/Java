#include<iostream>

using namespace std;
class Flash {
private:
	bool isFlashOn;

public:
	Flash() {
        isFlashOn = false;
    }

    void setFlashOn(bool flashOn) {
        isFlashOn = flashOn;
    }

     void flashLight() {
        if (isFlashOn) {
            cout<<"Flashing light."<<endl;
        }
    }
};

class Camera {
private:
	Flash flash;

public:
	void clickPicture() {
        flash.flashLight();
    }

    void setFlashOn(bool flashOn) {
        flash.setFlashOn(flashOn);
    }

    ~Camera() {
    	// Destruction of the camera causes the destruction of flash.
    	flash.~Flash();
    }
};

int main(void) {
    Camera camera;
    camera.setFlashOn(true);
    camera.clickPicture();
    camera.~Camera();
}