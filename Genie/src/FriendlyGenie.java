public class FriendlyGenie extends Genie{

    public int friendlyNumberOfWishes = numberOfWishes;

    public int count = 1;
    public FriendlyGenie(int numberOfWishes) {
        super(numberOfWishes);
    }
    public String friendlyGeniePresentation() {
        return "Hello! I'm the friendly genie and i give you " + friendlyNumberOfWishes + " wishes.";
    }
    public String grantWishes() {
       if (numberOfWishes>=count) {
            System.out.println("Your " + count +"º wish was granted");
            count += 1;
            return "wats your next wish?";

        } else count=1;



        return "you have no more wishes";
    }



}
