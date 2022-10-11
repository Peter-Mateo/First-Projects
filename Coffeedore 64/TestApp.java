public class TestApp {
    public static void main(String[] args) {
        CoffeeKiosk test = new CoffeeKiosk();
        test.addMenuItem("Cappucino", 5);
        test.addMenuItem("latte", 8);
        test.addMenuItem("latte", 8);
        // Test index 
        test.newOrder();
        
    }
}
