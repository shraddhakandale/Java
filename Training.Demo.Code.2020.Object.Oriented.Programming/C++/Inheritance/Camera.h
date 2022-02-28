#include<iostream>

using namespace std;
// Parent class
class Camera {
    // Fields that will be inherited by child classes
protected:
	float zoomLevel;
    bool isFlashOn;

public:
	Camera() {
        zoomLevel = 1;
        isFlashOn = false;
    }

    // Methods that will be inherited by child classes
    void setZoomLevel(float zoomLevel) {
        this->zoomLevel = zoomLevel;
    }

    void clickPicture() {
        cout<<"Clicking picture."<<endl;
    }

    void printDetails() {
        cout<<"--------I am Camera--------"<<endl;
        cout<<"My zoom level is "<<zoomLevel<<"."<<endl;
        cout<<"My flash is "<<(isFlashOn ? "ON" : "OFF")<<"."<<endl;
        cout<<"---------------------------"<<endl;
    }

private:
	void toggleFlashState() {
        isFlashOn = !isFlashOn;
    }
};
