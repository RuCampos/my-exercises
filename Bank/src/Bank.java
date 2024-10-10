public class Bank {
    public String bankName;
    private int moneyAmount = 100;
    public int deposit = 50;


    public Bank (String bankName){
            this.bankName = bankName;
        }
            public String getBankName () {
                return bankName;
            }

        public int getMoneyAmount() {
            return moneyAmount;
        }

        public int depositOperation () {
           moneyAmount = moneyAmount + deposit;
        return moneyAmount;
        }
    }



