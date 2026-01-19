package JAVA;
import java.util.Scanner;
public class JumpingStatement9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: Using break statement in a loop
        
        // while(true) {
        //     System.out.print("Enter a number (negative to exit): ");
        //     int num = sc.nextInt();
        //     if(num < 0) {
        //         System.out.println("Negative number entered. Exiting loop.");
        //         break; // Exit the loop if a negative number is entered
        //     }
        //     System.out.println("You entered: " + num);
        // }

        // Example 2: Continue..
        // for(int i = 1; i <= 10; i++) {
        //     if(i % 2 == 0) {
        //         continue; // Skip even numbers
        //     }
        //     System.out.println(i); // Print only odd numbers
        // }

        // Example 3: Return..
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if(age < 0) {
            System.out.println("Invalid age.");
            return;
        }
        System.out.println("Age is: " + age);
    }

}