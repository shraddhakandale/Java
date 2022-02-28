public class Button {

    private ButtonClickListener buttonClickListener;

    public void registerListener(ButtonClickListener listener) {
        buttonClickListener = listener;
    }

    public void clickPicture() {
        if (buttonClickListener != null) {
            buttonClickListener.onButtonClick();
        }
    }
}
