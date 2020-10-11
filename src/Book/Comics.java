package Book;

public class Comics extends Book {

    public Comics(String title, BookNumber bookNumber) {
        super(title, bookNumber);
    }

    public static String setType(){
        return "Comics";
    }


    public String printInfo(){
        String sentence = super.printInfo() + " new info type "
                + setType();
        return sentence;
    }

    public static void main(String[] args) {
        Comics comicsOne = new Comics("Biblia", new BookNumberISSN("142S-XX12"));

        System.out.println(comicsOne.printInfo());


    }
}

