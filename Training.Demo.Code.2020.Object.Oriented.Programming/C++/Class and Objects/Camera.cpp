#include<iostream>

using namespace std;
// Blueprint of cameras
class Camera {

private:
	// Fields - will represent state of objects
	bool isFlashOn;
	int framesPerSecond;
	float zoomLevel;

public:
	// Constructors
    // Default constructor
	Camera() {
		isFlashOn = false;
        framesPerSecond = 60;
        zoomLevel = 1;
	}

	// Parameterized constructor
	Camera(bool isFlashOn, int framesPerSecond, float zoomLevel) {
		this->isFlashOn = isFlashOn;
		this->framesPerSecond = framesPerSecond;
		this->zoomLevel = zoomLevel;
	}

	// Copy constructor
	Camera(Camera &camera) {
		this->isFlashOn = camera.isFlashOn;
		this->framesPerSecond = camera.framesPerSecond;
		this->zoomLevel = camera.zoomLevel;
	}

	// Methods - define behaviours of future objects
	void clickPicture() {
        // Click picture
        cout<<"Clicking picture..."<<endl;
    }

    void captureVideo() {
        // Capture video
        cout<<"Capturing video..."<<endl;
    }

    void toggleFlash() {
        isFlashOn = !isFlashOn;
    }

    void setFramesPerSecond(int framesPerSecond) {
        this->framesPerSecond = framesPerSecond;
    }

    void setZoomLevel(float zoomLevel) {
        this->zoomLevel = zoomLevel;
    }

    void printDetails() {
        cout<<"-----------I am a Camera object-----------"<<endl;
        cout<<"My flash is "<<(isFlashOn ? "ON" : "OFF")<<"."<<endl;
        cout<<"My frames per second is "<<framesPerSecond<<"."<<endl;
        cout<<"My zoom level is "<<zoomLevel<<"."<<endl;
        cout<<"My identity is "<<this<<"."<<endl;
        cout<<"------------------------------------------"<<endl;
    }
};

int main(void) {
	// Objects of camera
    Camera camera1;
    Camera camera2(false, 80, 1.5f);

    // Executing behaviours
    camera1.setFramesPerSecond(70);
    camera1.toggleFlash();

    camera1.printDetails();
    camera2.printDetails();

	return 0;
}