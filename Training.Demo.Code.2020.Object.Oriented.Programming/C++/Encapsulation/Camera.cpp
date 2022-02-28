#include<iostream>

using namespace std;
// Data and methods that operate on the data are encapsulated together
class Camera {

private:
	float zoomLevel;
    float exposureLevel;
    int framesPerSecond;
    bool isFlashOn;

public:
	void zoomIn() {
        if (zoomLevel < 4) {
            zoomLevel += 0.1;
        }
    }

    void zoomOut() {
        if(zoomLevel > 0) {
            zoomLevel -= 0.1;
        }
    }

    void setExposureLevel(float exposureLevel) {
        this->exposureLevel = exposureLevel;
    }

    void setFramesPerSecond(int framesPerSecond) {
        this->framesPerSecond = framesPerSecond;
    }

    void toggleFlashState() {
        isFlashOn = !isFlashOn;
    }
};