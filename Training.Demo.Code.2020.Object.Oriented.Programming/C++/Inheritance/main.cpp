#include<iostream>
#include "VideoCamera.h"

using namespace std;
int main(void) {
    Camera camera;
    // camera can only click picture
    camera.clickPicture();
    // camera has only zoomLevel and isFlashOn
    camera.printDetails();

    VideoCamera videoCamera;
    // Video camera inherited behaviour of clicking picture from camera
    videoCamera.clickPicture();
    // Video camera can capture video as well
    videoCamera.captureVideo();
    // Video camera has zoomLevel, isFlashOn, framesPerSecond
    videoCamera.printDetails();

    return 0;
}