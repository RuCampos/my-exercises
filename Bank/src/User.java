public class User {

    private String userName;
    private String userPin;
    public Bank bank1 = new Bank("Montepio");


    public User (String userName, String userPin) {
        this.userName = userName;
        this.userPin = userPin;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserPin(){
        return userPin;
}
    public int checkMoney (){
        return bank1.getMoneyAmount();

 }
    public String checkBank (){
        return bank1.getBankName();



}
    public int Deposit () {

        return bank1.depositOperation();
    }

}
