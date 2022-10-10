import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item>items;
    //
    Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
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
    }
    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public void addItem(ArrayList<Item>items){
        this.items.addAll(items);
    }
}
