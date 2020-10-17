package Day2.wewnetrzna;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        String message = " Dzien dobry";

        Feedback feedback = new Feedback() { //tworzymy anonimową klase implementującą interfejs
            @Override
            public void call() {
                System.out.println(message); //dostęp do zmiennych finalnych z metody zewnętrznej
            }
        };

        FeedbackConsumer feedbackConsumer = new FeedbackConsumer(feedback);
        feedbackConsumer.onEvent();

        Book book = new Book("Hell", "1234-5678") {  // tworzymy anonimową klasę rozszerzającą
            @Override
            public String getNumber() {
                return "not defined";
            }
        };

        System.out.println(book.getNumber());

        Book[] books = new Book[2];
        books[0] = new Book("Gdzies tam", "5678-1234");
        books[1] = new Book("Dawno temu", "1234-5678");

        Arrays.sort(books, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return ((Book) o1).getTitle().compareTo(((Book) o2).getTitle());
            }
        });
        System.out.println("Sorted:");
        for (Book b : books) {
            b.printInfo();
        }
    }

}
