import java.util.Scanner;
import java.util.*;
public class arrayTool {
    public static void main(String[] args) throws Exception {
        Scanner myscan = new Scanner(System.in);
        //Prompting user input
        System.out.println("Thank you for using the Awesome Array Tool");
        System.out.println("Enter 5 numbers (press enter each time): ");
        //Initializing user inputs and variables
        int num1 = myscan.nextInt();
        int num2 = myscan.nextInt();
        int num3 = myscan.nextInt();
        int num4 = myscan.nextInt();
        int num5 = myscan.nextInt();        
        int i;
        int sum = 0;
        int product = 1;        
        myscan.close();
        //making a new integer arraylist
        ArrayList<Integer> daArray = new ArrayList<Integer>(5);
        daArray.add(num1);
        daArray.add(num2);
        daArray.add(num3);
        daArray.add(num4);
        daArray.add(num5);

        // Loop for sum and product
        for(i = 0; i < daArray.size(); i++){
            sum = sum + daArray.get(i);            
            product = product * daArray.get(i);
        }
        // Print Results
        System.out.println("ArrayList Sum: " + sum);
        System.out.println("ArrayList Product: " + product);
        // Used collection for min and max value
        System.out.println( "ArrayList Min Value: " + Collections.min(daArray) );
        System.out.println( "ArrayList Max Value: " + Collections.max(daArray) );


    }
}
