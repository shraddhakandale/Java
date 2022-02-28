#include<iostream>

using namespace std;
// Abstract class
class Camera {

public:
	void clickPicture() {
        cout<<"Clicking picture."<<endl;
        savePicture();
    }

    // savePicture() is only declared. It does not have definition.
    virtual void savePicture();
};