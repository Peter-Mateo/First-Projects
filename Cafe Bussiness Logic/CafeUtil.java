import java.util.ArrayList;
import java.text.*;
public class CafeUtil {
    // Sums together every consecutive integer from 1 to 10 and returns the sum
    int getStreakGoal(){
        // Declaring the variable
        int finalAddition = 0;
        // Adds all the numbers together from 1-10
        for (int i = 10; i != 0; i--){
            finalAddition += i;
        }
        // Return value
        return finalAddition;
    }
    // Sum all of the prices in the array and return the total
    double getOrderTotal(double[]prices){
        // Declaring return value
        int total = 0;
        // Enhanced loop to add to total
        for (double price : prices){
            total += price;
        }
        // Returns total
        return total;
    }
    // Print out each index and menu item from an array
    void displayMenu(ArrayList<String> menuItems){
        // For loop to print all the index and menu values
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }
    // User Input
    void addCustomer(ArrayList<String> customers){
        // Print input string
        System.out.println("Please enter your name: ");
        // Takes the user input and stores it as a variable username
        String userName = System.console().readLine();
        // Print greeting
        String greeting = String.format("Hello, %s", userName);
        System.out.println(greeting);
        // Print the line wait
        String lineWait = String.format("There are %s people in front of you.", customers.size());
        System.out.println(lineWait);
        // Add the customers name to the list
        customers.add(userName);
        // Print the list
        System.out.println(customers);
    }
    /* Ninja Bonuses */

    // Formats Numbers
    static public String customFormat(String pattern, double value){
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        return output;
    }
    // Finds the price of the product based on how many they may buy (Quantity)
    void printPriceChart(String product, double price, int maxQuantity){
        // Print the item
        System.out.println(product);
        // For loop up to the maxQuanity multipling the value by the quantity
        for (int i = 1; i <= maxQuantity; i++){
            if (i > 1){
                // Prints the String
                System.out.println(i + " - " + customFormat("$###,###.###", ((price * i) - .50)));
            }
            else {
                // Prints the String
                System.out.println(i + " - " + customFormat("$###,###.###", price * i));
            }
        }
    }
    //Overload the DisplayMenu
    boolean displayMenu(ArrayList<String>menuItems,ArrayList<Double>prices){
        // Checks to see if the arrays are the same size
        if (menuItems.size() != prices.size()){
            return false;
        }
        // Prints the index, item, and price
        else{
            for (int i = 0; i < prices.size(); i++){
                System.out.println(i + " " + menuItems.get(i) + " -- " + "$" + prices.get(i));
            }
            return true;
        }
    }
    // Allow the barista to add customers to Array
    void addCustomers(){
        // Declaring list
        ArrayList<String> customers = new ArrayList<String>();
        // 
        System.out.println("Enter customers name: ");
        // User input 
        String name = System.console().readLine();
        // While the barista has not typed q keep running 
        while(name != "q"){
            // Adds the customer to the Array
            customers.add(name);
            //
            System.out.println("If you are finished type q ");
            System.out.println("Enter customers name: ");
            name = System.console().readLine();
        }
    }
}
