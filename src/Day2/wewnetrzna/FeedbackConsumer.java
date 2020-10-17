package Day2.wewnetrzna;

public class FeedbackConsumer {

    private Feedback feedback;

    public FeedbackConsumer(Feedback listener) {
        this.feedback = listener;
    }

    public void onEvent() {
        feedback.call();
    }

}
