#include<iostream>
#include "Camera.h"

using namespace std;
class GoPro: public Camera {

public:
    // Overriding method
    void savePicture() {
        cout<<"Saving picture to cloud."<<endl;
    }
};
