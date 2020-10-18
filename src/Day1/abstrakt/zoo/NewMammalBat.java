package Day1.abstrakt.zoo;

public class NewMammalBat {
    public static void main(String[] args) {

        new Mammal("nietoperz") {
            @Override
            public void giveSound() {
                System.out.println("batman na na na na na na na na ");
            }
        }.giveSound();


        Mammal bat = new Mammal("nietoperz") {
            @Override
            public void giveSound() {
                System.out.println("phiphiphi");
            }
        };
        bat.giveSound();
    }
}
