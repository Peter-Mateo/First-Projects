import java.util.ArrayList;
public class JavaPractice {
    public static void main(String [] args){
        // Creating the Array List 
        ArrayList<Double> grades = new ArrayList<Double>();
        // Adds values to the Array List
        grades.add(3.5);
        grades.add(2.6);
        // Creating a List of the names
        String[] names = {"Peter", "Leonardo"};
        // Array List combining the students gpa and names
        ArrayList<Object> gradesAndNames = new ArrayList<Object>();
        // For loop to combine the values
        for (int i = 0; i < grades.size(); i++ ){
            gradesAndNames.add(grades.get(i) + " " + names[i]);
        }
        // Printing the list
        System.out.println(gradesAndNames);
    }
}