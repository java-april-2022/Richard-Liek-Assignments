import java.util.ArrayList;

public class CafeUtil {
    /* 
     Streak goal test!!
    */

   public int getStreakGoal() {
       int Streak = 0;
       for(int i = 1; i <=10; i++){
           Streak += i;
       }
       return Streak;
   }
    
   /* 
   ORDER TOTAL TEST!!
   */

    public double getOrderTotal(double[] prices) {
        double totalSum = 0;
        for (int i = 0; i < prices.length; i++) {
            totalSum = totalSum + prices[i];
        }
        return totalSum;
    }

    /* 
    Display Menu Test!!
    */

    public void displayMenu(ArrayList<String> menuItems){
        String name = menuItems.get(0);
        for (int i = 0; i < menuItems.size(); i++)
            System.out.println(i + name);
    }

    // Add Customer Test!!

    public void addCustomer(ArrayList<String> customers) {
        // inputing name
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        //prints out hello *name*!
        System.out.printf("Hello, %s!%n", userName);
        // prints out number of people infront of you
        System.out.printf("There are currently %s people infront of you.", customers.size());
        customers.add(userName);
    }

    // Ninja bonuses!

    public void printPriceChart(String productName, double price, int maxQuantity) {

        System.out.printf("%s%n", productName);
        //prints out price, mutliplied up to max quantity (QTY * price).
        for(int qty = 1; qty < maxQuantity; qty++) {
            System.out.printf("%s - $%.2f%n", qty, qty * price);
        }
    }
}
