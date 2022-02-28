#include<iostream>
#include "DigitalCamera.h"

using namespace std;
// Concrete class
class DSLR: public DigitalCamera {

public:
	void savePicture() {
        cout<<"Saving picture to SD card."<<endl;
    }

    void displayPictureOnScreen() {
        cout<<"Displaying picture on screen"<<endl;
    }
};