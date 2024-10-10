public class SandBox{

    public static void main (String[] args){
        User user1 = new User("Rui","1234");

        System.out.println("Olá " + user1.getUserName());
        System.out.println("Tens "+user1.checkMoney()+" na tua conta "+ user1.checkBank());
        System.out.println("Após deposito o teu saldo é agora : "+ user1.Deposit());
    }



}
