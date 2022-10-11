import java.io.IOException;
import java.util.ArrayList;
public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Clears Console - Windows - Linux
    public void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {}
    }
    // Constructor No parameters initializes item and order empty arrays
    CoffeeKiosk(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }
    // Method should create a new item object with a given name and price
    public void addMenuItem(String name, double price){
        Item newItemObject = new Item(name, price);
        // Adds to the menu ArrayList
        menu.add(newItemObject);
        // Assign the index postion
        newItemObject.setIndex(menu.indexOf(newItemObject));
    }
    // Display
    public void displayMenu(){
        for (Item items : menu){
            System.out.println(items.getIndex() + " " + items.getName() + " -- $" + items.getPrice());
        }
    }
    public void takeOrder(){
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        //Clears console
        this.clearConsole();
        // Creates a new order with the given input string
        Order newOrder = new Order(name);
        // Shows the user the menu, so they can choose items to add
        this.displayMenu();
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        //Clears console
        this.clearConsole();
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            newOrder.addItem(menu.get(Integer.parseInt(itemNumber)));
            // Shows the user the menu
            this.displayMenu();
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            //Clears console
            this.clearConsole();
        }
        // Adds the orders to the order list
        orders.add(newOrder);
    }
    public void newOrder() {
        this.takeOrder();
        // Checks to see if there are more in the "party" who want to order
        System.out.println("Would anyone else like to order? Yes No");
        String party = System.console().readLine();
        while (party.toLowerCase().contains("yes")){
            //Clears console
            this.clearConsole();
            // Takes new order
            this.takeOrder();
            // Checks to see if there are more in the "party"
            System.out.println("Would anyone else like to order? Yes No");
            party = System.console().readLine();
        }
        //Clears console
        this.clearConsole();
        // Prints all the order details 
        for (Order order : orders){
            System.out.println(order.getName());
            for (Item item : order.getItems()){
                System.out.println(item.getName() + " - $" + item.getPrice());
            }
            System.out.println("-----------------");
            System.out.println("Total: " + order.getOrderTotal());
            System.out.println("-----------------------------------");
        }
    }
}
