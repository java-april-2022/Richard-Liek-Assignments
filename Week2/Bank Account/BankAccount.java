import java.text.NumberFormat;
import java.util.Currency;
import java.util.Random;

public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private int accountNumber;

    private static int numberOfAccounts;
    private static double accountTotal;

    public BankAccount(){
        checkingBalance = 0;
        savingsBalance = 0;
        numberOfAccounts++;
        accountNumber = randomAccountNumber(10000000, 99999999);

    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void displayBankAccount(){
        
        System.out.println("Account Number: " + accountNumber);
       
        //Formatted to display checking total in currency
        NumberFormat checking = NumberFormat.getCurrencyInstance();
        String checkingTotal = checking.format(checkingBalance);
        System.out.println("Checking Balance: " +  checkingTotal);
        
        //Formatted to display savings total in currency
        NumberFormat savings = NumberFormat.getCurrencyInstance();
        String savingsTotal = savings.format(savingsBalance);
        System.out.println("Savings Balance: " +  savingsTotal);
    }

    public void depositMoney(String account, double amount){
        if(account == "checking"){
            checkingBalance+= amount;
        }
        else if(account == "saving"){
            savingsBalance+= amount;
        }
        accountTotal+= amount;
    }

    public void withdrawMoney(String account, double amount){
        if(account == "checking" && checkingBalance - amount >= 0){
            checkingBalance-= amount;
            accountTotal-= amount;
        }
        else if(account == "saving" && savingsBalance - amount >= 0){
            savingsBalance-= amount;
            accountTotal-= amount;
        }
    }
    //Random account number
    public static int randomAccountNumber(int start, int finish){
        Random num = new Random();

        int accountNumber = num.nextInt(finish + 1 - start) + start;
        return accountNumber;
    }
}
