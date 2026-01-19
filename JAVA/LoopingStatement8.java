// for Loop (with user input)
// Example: Print numbers from 1 to N (user input)




package JAVA;
import java.util.Scanner;
public class LoopingStatement8 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. for Loop..
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++) {
        //     System.out.println(i);
        // }

        // 2. While Loop..
        // System.out.print("Enter a number:");
        // int num = sc.nextInt();
        // while(1 <= num) {
        //     System.out.println(num);
        //     num--;
        // }


        // 3. do-while Loop..
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;

        do {
            fact = fact * i;
            i++;

        } while(i <= n);
        i=1;
        System.out.println("Factorial of " + n + " is " + fact);
    }
    
}
