public class JavaPractice {
    public static void main(String [] args){
        // Initialize Shoe OOP
        Shoe shoe1 = new Shoe("Jordan", "White");
        Shoe shoe2 = new Shoe("Nike", "black", 11.5);
        Shoe shoe3 = new Shoe("Addidas", "White", 12, true);

        // Print the results
        System.out.printf("Shoe brand: %s \nLace color: %s \nSize: %.1f \nWorn: %s", shoe3.getBrand(), shoe3.getLaceColor(), shoe3.getSize(), shoe3.getUsed());
    }
}