public class Cafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        // Create 3 more drink price variables - dripCoffee, latte, cappucino
        double dripCoffee = 2.4;
        double latte = 4.5;
        double cappucino = 6;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        // Create three more customers - Sam, Jimmy, Noah
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + ", " + customer2 + ", " + customer3 + ", " + customer4); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        // Cindhuri orders a coffee
        if (isReadyOrder1){
            System.out.println("Cindhuri, you have ordered a coffee your total is: $" + dripCoffee);
        }
        else {
            System.out.println("You are not Ready to order yet Cindhuri");
        }
        // Noah ordered a cappucino 
        if (isReadyOrder4){
            System.out.println("Noah, you have ordered a cappucino your total is: $" + cappucino);
        }
        else{
            System.out.println("You are not Ready to order yet Noah");
        }
        //Sam orders 2 lattes 
        if (isReadyOrder2){
            System.out.println("Sam, you have ordered 2 lattes your total is: $" + (latte * 2));
        }
        else {
            System.out.println("You are not ready to order yet Sam");
        }
        // Jimmy realized he was charged for a coffe but had ordered a latte 
        if (isReadyOrder3){
            System.out.println("Jimmy you were charged for a latte, my apologies you still owe: $" + (latte - dripCoffee));
        }
        else {
            System.out.println("You are not ready to order yet Jimmy");
        }
    }
}
