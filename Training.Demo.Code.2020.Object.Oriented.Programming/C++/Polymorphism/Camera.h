#include<iostream>

using namespace std;
class Camera {
private:
	int batteryLevel;

public:
	Camera() {
        batteryLevel = 50;
    }
    
    void charge() {
        cout<<"Connecting fresh, fully charged batteries."<<endl;
        batteryLevel = 100;
    }

    // Method overloading
    int charge(int chargeToPercent) {
        if (chargeToPercent > batteryLevel && chargeToPercent <= 100) {
            cout<<"Charging by plugging to power supply."<<endl;
            batteryLevel = chargeToPercent;
        } else {
            cout<<"Invalid value given for chargeToPercent."<<endl;
        }
        return batteryLevel;
    }

    // Overridden method
    void savePicture() {
        cout<<"Saving picture to memory card."<<endl;
    }
};