// if:-     if statement is used to check a condition.If the condition is true, the code inside if runs.If the condition is false, the code does not run.
// if-else:-  
// else-if ladder
// switch:- A switch statement is used to choose one option from many choices based on a value.Instead of using many if-else, we use switch.



package JAVA;
import java.util.Scanner;
public class ConditionalStatement7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if Statement..
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();

        // if(num > 0 )
        // {
        //     System.out.println("Number is Positive");
        // }


        // if - else Statement..

        // System.out.println("Enter a number");
        // int num = sc.nextInt();

        // if(num % 2 == 0)
        // {
        //     System.out.println("Number is Even");
        // } else {
        //     System.out.println("Number is odd");
        // }


        // else- if ladder..
        // System.out.println("Enter Marks:");
        // int marks = sc.nextInt();

        // if(marks >= 90) {
        //     System.out.println("Grade A");
        // } else if(marks >= 75) {
        //     System.out.println("Grade B");
        // } 
        // else if(marks >= 60) {
        //     System.out.println("Grade C");
        // }
        // else if(marks >= 40) {
        //     System.out.println("Grade D");
        // }
        // else {
        //     System.out.println("Fail");
        // }


        // Switch Statements..
        System.out.println("Eneter day number: ");
        int day = sc.nextInt();

        switch(day) {
            case 1: 
            System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                    case 4: 
                    System.out.println("Thursday");
                    break;
                    case 5:
                        System.out.println("Friday");
                        break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                            case 7:
                                System.out.println("Sunday");
                                break;
                                default:
                                    System.out.println("Invailed day Number");
        }

    }
    
}
