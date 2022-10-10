import java.util.ArrayList;
public class Order {
    // Variable Declaration
    private String name;
    private boolean ready;
    private ArrayList<Item>items;
    // Default constructor
    Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    // Overload constructor - if name
    Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    // Getters
    public String getName(){
        return name;
    }
    public boolean getStatusMessage(){
        return ready;
    }
    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.println("Customer Name: " + name);
        for (Item item : items){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
        System.out.println("Ready: " + this.getStatusMessage());
    }
    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public void addItem(Item newitems){
        this.items.add(newitems);
    }
}
