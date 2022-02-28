#include<iostream>
#include "Camera.h"

using namespace std;

int main(void) {
    Camera camera;
    // Static/compile time polymorphism
    camera.charge(75);
    camera.charge();

    Camera goPro;
    // Dynamic/runtime polymorphism
    camera.savePicture();
    goPro.savePicture();

    return 0;
}