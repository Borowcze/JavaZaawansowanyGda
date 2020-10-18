package Day2.wewnetrzna;

import Day1.abstrakt.zoo.Animal;
import Day1.abstrakt.zoo.Monkey;

public class LocalInnerClassEx {

    private final Animal makak;

    public LocalInnerClassEx(){
        this.makak = new Monkey() {
            @Override
            public void giveSound(){
                System.out.println("makamakamaka");
            }
        };
    }

    public Animal getMonkey(){
        return makak;
    }


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

        LocalInnerClassEx localInnerClassEx = new LocalInnerClassEx();

        localInnerClassEx.getMonkey().giveSound();


    }

}
