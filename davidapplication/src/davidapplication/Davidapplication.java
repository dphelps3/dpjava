
package davidapplication;

import java.util.Scanner;

public class Davidapplication {

    public static void main(String[] args) {
        
        // scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // variables
        int age = 0;
        
        System.out.println("What is your age? ");
        age = keyboard.nextInt();
        
        if (age < 10 || age > 75) {
            System.out.println("At risk");
        } else {
            System.out.println("fine");
        }
        
    }
    
}
