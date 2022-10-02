import java.util.ArrayList;
public class JavaPractice {
    public static void main(String [] args){
        // Creates the Array List
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Creating for loop for numbers 1-100
        for (int i = 0; i <= 100; i++){
            numbers.add(i);
        }
        // Printing out the list
        System.out.println(numbers);
    }
}