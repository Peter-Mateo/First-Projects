public class Shoe{
    private String brand;
    private String laceColor;
    private double size;
    private boolean used;
    // Shoe Creation
    Shoe(){
    }
    // Shoe Brand - Lace Color
    Shoe(String brand, String laceColor){
        this.brand = brand;
        this.laceColor = laceColor;
    }
    // Shoe Brand - Lace Color = Size
    Shoe(String brand, String laceColor, double size){
        this.brand = brand;
        this.laceColor = laceColor;
        this.size = size;
    }
    Shoe(String brand, String laceColor, double size, boolean used){
        this.brand = brand;
        this.laceColor = laceColor;
        this.size = size;
        this.used = used;
    }
    // Get Methods
    public String getBrand() {
        return brand;
    }
    public String getLaceColor() {
        return laceColor;
    }
    public double getSize() {
        return size;
    }
    public boolean getUsed(){
        return used;
    }
}