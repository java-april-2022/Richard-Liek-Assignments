public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double caramelPrice = 2.7;
        double espressoPrice = 3.2;
        double coldbrewPrice = 3.3;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        if(isReadyOrder1) {
            System.out.println(readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }

        //Order #2 Sam

        System.out.println(generalGreeting + customer2);

        System.out.println(displayTotalMessage + caramelPrice * 2);

        if(isReadyOrder2) {
            System.out.println(readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }

         //Order #3 Jimmy

         System.out.println(generalGreeting + customer3);

         System.out.println(displayTotalMessage + (espressoPrice - caramelPrice));
 
         if(isReadyOrder3) {
             System.out.println(readyMessage);
         }
         else {
            System.out.println(pendingMessage);
        }

         //Order #4 Noah

         System.out.println(generalGreeting + customer4);

         System.out.println(displayTotalMessage + coldbrewPrice);
 
         if(isReadyOrder4) {
             System.out.println(readyMessage);
         }
         else {
            System.out.println(pendingMessage);
        }
    }

}