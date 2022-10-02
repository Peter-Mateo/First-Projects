import java.util.ArrayList;
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
    // 
    void addCustomer(ArrayList<String> customers){
        // Print input string
        System.out.println("Please enter your name: ");
        // Takes the user input and stores it as a variable username
        String userName = System.console().readLine();
        // Print greeting
        String greeting = String.format("Hello, %s", userName);
        System.out.println(greeting);
        // Print the line wait
        String lineWait = String.format("There are %.2f people in front of you.", customers.size());
        System.out.println(lineWait);
        // Add the customers name to the list
        customers.add(userName);
        // Print the list
        System.out.println(customers);
    }   
}
