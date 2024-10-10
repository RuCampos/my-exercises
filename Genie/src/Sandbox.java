public class Sandbox {

    public static void main(String[] args) {
        FriendlyGenie f1 = new FriendlyGenie(3);
        GrumpyGenie g1 = new GrumpyGenie(3);

        System.out.println(f1.friendlyGeniePresentation());
        System.out.println(f1.grantWishes());
        System.out.println(f1.grantWishes());
        System.out.println(f1.grantWishes());
        System.out.println(f1.grantWishes());

        //System.out.println((g1.grumpyGeniePresentation()));
       // System.out.println(g1.grantWishes());

    }
}
