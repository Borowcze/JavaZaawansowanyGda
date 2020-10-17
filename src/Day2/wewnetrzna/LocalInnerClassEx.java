package Day2.wewnetrzna;

public class LocalInnerClassEx {

    public static void main(String[] args) {
        String message = " Dzien dobry";

        class FeedbackImpl extends Feedback {

            @Override
            public void call() {
                System.out.println(message); //dostęp do zmiennych finalnych z metody zewnętrznej
            }
        }

        Feedback feedback = new Feedback() {
            @Override
            public void call() {
                System.out.println(message); //dostęp do zmiennych finalnych z metody zewnętrznej
            }
        };

        FeedbackConsumer feedbackConsumer = new FeedbackConsumer(feedback);
        feedbackConsumer.onEvent();

        FeedbackConsumer feedbackConsumer1 = new FeedbackConsumer(new FeedbackImpl() {
            @Override
            public void call() {
                System.out.println("asdfsadfasdfs");
            }
        });

//        BookNumber bookNumber = new BookNumberImpl("1234-5678");
//        bookNumber.getNumber();
    }

}
