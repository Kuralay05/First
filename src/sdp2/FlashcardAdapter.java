package sdp2;

class FlashcardAdapter implements FlashcardApp {
    private ThirdPartyFlashcard thirdPartyFlashcard;

    public FlashcardAdapter(ThirdPartyFlashcard thirdPartyFlashcard) {
        this.thirdPartyFlashcard = thirdPartyFlashcard;
    }

    @Override
    public void showQuestion() {
        thirdPartyFlashcard.displayFront();
    }

    @Override
    public void showAnswer() {
        thirdPartyFlashcard.displayBack();
    }
}
