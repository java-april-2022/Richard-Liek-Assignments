import java.util.ArrayList;

public class CafeUtil {
    /* 
     Streak goal test!!
    */

   public int getStreakGoal() {
       int sum = 0;
       for(int i = 1; i <=10; i++){
           sum += i;
       }
       return sum;
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
        String name = menuItems.get(0); // to access an element in an ArrayList using an index
        for (int i = 0; i < menuItems.size(); i++)
            System.out.println(i + name);
    }

    // Add Customer Test!!

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        
        System.out.printf("Hello, %s! \n", userName);

        System.out.printf("There are currently %s people infront of you.", customers.size());
        customers.add(userName);
    }

    // Ninja bonuses!

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);

    }
}
