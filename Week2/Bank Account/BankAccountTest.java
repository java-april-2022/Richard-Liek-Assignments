public class BankAccountTest{
    public static void main(String[] arg){
        BankAccount Richie = new BankAccount();
        //Change amount to make new total for checking/saving
        Richie.depositMoney("checking", 250000);
        Richie.depositMoney("saving", 50000);
        
        //withdraw money then it displays new total
        Richie.withdrawMoney("checking", 500);

        Richie.displayBankAccount();
    }
}
