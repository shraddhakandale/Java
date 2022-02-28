#include<iostream>
#include "Camera.h"

using namespace std;
// Child class that is also abstract, it does not provide definition for savePicture(),
// that it inherits from Camera and adds another another abstract method
class DigitalCamera: public Camera {

public:
	virtual void displayPictureOnScreen() = 0;
};