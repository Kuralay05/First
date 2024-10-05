package sdp2;

public class QuizletApp {
    public static void main(String[] args) {
        ThirdPartyFlashcard thirdPartyFlashcard = new ThirdPartyFlashcard();
        FlashcardApp adapter = new FlashcardAdapter(thirdPartyFlashcard);

        adapter.showQuestion(); // Outputs: Third Party: Showing question
        adapter.showAnswer();   // Outputs: Third Party: Showing answer
    }
}
