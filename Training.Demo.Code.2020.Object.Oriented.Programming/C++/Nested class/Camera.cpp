#include<iostream>
#include<string>

using namespace std;
class Camera {

private:
	string name;

public:
	Camera(string name) {
		this->name = name;
	}

	// Nested classes - All nested classes in C++ are same as static nested classes. There is nothing similar to inner class in C++.
	class Tripod {

	private:
		int heightCentimeters;
        int horizontalAngle;
        int verticalAngle;

    public:
    	Tripod() {
            heightCentimeters = 100;
            horizontalAngle = 0;
            verticalAngle = 0;
        }

        void adjustTripod(int heightCentimeters, int horizontalAngle, int verticalAngle) {
            this->heightCentimeters = heightCentimeters;
            this->horizontalAngle = horizontalAngle;
            this->verticalAngle = verticalAngle;
        }

        void attachCamera(Camera camera) {
            // Cannot directly access member of outer class. Need an object of outer class.
            cout<<"Attaching a camera"<<camera.name<<"."<<endl;
        }

        void detachCamera(Camera camera) {
            // Cannot directly access member of outer class. Need an object of outer class.
            cout<<"Detaching "<<camera.name<<"."<<endl;
        }
	};
};

int main(void) {
	Camera canon("Canon");
    Camera goPro("GoPro");

    // Associated with outer class, not an object of outer class
    Camera::Tripod tripod;
    tripod.attachCamera(canon);
    tripod.detachCamera(canon);
    tripod.attachCamera(goPro);
    tripod.detachCamera(goPro);

	return 0;
}