public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        // 
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 8;
        // 
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 6;
        //
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 5;
        //
        Item item4 = new Item();
        item4.name = "cappucino";
        item4.price = 7;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total += item1.price;
        order2.items.add(item1.name);
        order2.ready = true;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total += item4.price;
        order3.items.add(item4.name);

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total += item2.price;
        order4.items.add(item2.name);
        order4.total += item2.price * 2;
        
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
