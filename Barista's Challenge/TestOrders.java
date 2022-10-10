public class TestOrders {
    public static void main(String[] args){
        
        // Test Cases //
        // Menu items
        // 
        Item item1 = new Item("mocha", 8);
        // 
        Item item2 = new Item("latte", 6);
        //
        Item item3 = new Item("drip coffee", 5);
        //
        Item item4 = new Item("cappuccino", 7);
        // Create 2 orders for unsepecified guests
        Order order1 = new Order();
        Order order2 = new Order();
        // Create 3 orders using the overload constructor to give each a name for the order
        Order order3 = new Order("Peter");
        Order order4 = new Order("Leonardo");
        Order order5 = new Order("Steven");
        // Add at least 2 items to each of the orders using addItem() method
        // First Order
        order1.addItem(item1);
        order1.addItem(item2);
        // Display
        order1.display();
        System.out.println("--------------------------------------------------------");

        // Second Order
        order2.addItem(item3);
        order2.addItem(item2);
        // Display
        order2.display();
        System.out.println("--------------------------------------------------------");

        // Third Order
        order3.addItem(item4);
        order3.addItem(item3);
        // Display
        order3.display();
        System.out.println("--------------------------------------------------------");

        // Fourth Order
        order4.addItem(item1);
        order4.addItem(item3);
        // Display
        order4.display();
        System.out.println("--------------------------------------------------------");

        // Fifth Order
        order5.addItem(item4);
        order5.addItem(item2);
        // Display
        order5.display();
        System.out.println("--------------------------------------------------------");
    }
}
