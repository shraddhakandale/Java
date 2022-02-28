#include<iostream>
#include "Camera.h"

using namespace std;
// Child class
class VideoCamera: public Camera {

private:
	int framesPerSecond;

public:
    VideoCamera() {
        // Fields inherited from Camera
        zoomLevel = 1.5f;
        isFlashOn = false;
        // Field added by VideoCamera
        framesPerSecond = 65;
    }

    void setFramesPerSecond(int framesPerSecond) {
        this->framesPerSecond = framesPerSecond;
    }

    void captureVideo() {
        cout<<"Capturing video."<<endl;
    }

    void printDetails() {
        cout<<"-----I am Video Camera-----"<<endl;
        cout<<"My zoom level is "<<zoomLevel<<"."<<endl;
        cout<<"My flash is "<<(isFlashOn ? "ON" : "OFF")<<"."<<endl;
        cout<<"My frames per second is "<<framesPerSecond<<"."<<endl;
        cout<<"---------------------------"<<endl;
    }
};
