public class GrumpyGenie extends Genie {

    public int grumpyNumberOfWishes = numberOfWishes;
    public int grumpyChosenWish = (int) Math.ceil(Math.random()*numberOfWishes);
    public GrumpyGenie(int numberOfWishes) {
        super(numberOfWishes);
    }
    public String grumpyGeniePresentation() {
        return "Hello! I'm the grampy genie and i give you " + grumpyNumberOfWishes + " wishes.";
    }
    public String grantWishes() {
        for (int i=1; numberOfWishes>= i; i++) {
            if (grumpyChosenWish == i) {
                System.out.println("Your " + i + "º wish was granted");
            } else
                System.out.println("Your " + i + "º wish was not granted");


        }
        return "Bye! See you next time.";


}}