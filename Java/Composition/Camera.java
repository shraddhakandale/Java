public class Camera {
    private Flash flash;

    public Camera() {
        flash = new Flash();
    }

    public void clickPicture() {
        flash.flashLight();
    }

    public void setFlashOn(boolean flashOn) {
        flash.setFlashOn(flashOn);
    }

    private class Flash {
        private boolean isFlashOn;

        public Flash() {
            isFlashOn = false;
        }

        public void setFlashOn(boolean flashOn) {
            isFlashOn = flashOn;
        }

        public void flashLight() {
            if (isFlashOn) {
                System.out.println("Flashing light.");
            }
        }
    }
}
