#include<iostream>
#include "DSLR.h"

using namespace std;

int main(void) {
	// Objects can be created only for concrete classes, not for abstract classes
    DSLR dslr;

    dslr.clickPicture();
    dslr.displayPictureOnScreen();

	return 0;
}