package JAVA;
//  Data Type: - A data type tells the computer what kind of data a variable can store.
// It also decides how much memory is needed and what operations can be done on that data.

//  Example: number, character, text, true/false

// why use :- 
// Use memory properly
// Avoid errors
// Make program faster and safer

// diiference..
// | Primitive           | Non-Primitive                  

// | Stores single value | Stores multiple/complex values 
// | Fixed size          | Size can vary                  
// | Faster              | Slightly slower                

public class dataType3 {

    public static void main(String[] args)
    {
        // 1. Primitive Data Types..  (Pre define Datatype..)
        int myNum = 100;       // Integer (whole number)
        float myFloat = 10.5f; // float (decimal number)
        char myChar = 'A';   // Character
        boolean myBool = true; // Boolean (true/false)

        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloat);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBool);

        // 2. Non-Primitive Data Types..
        String myText = "Hello, Java!"; //String
        System.out.println("String: " + myText);

        // Type Casting..
        // Type casting means changing one data type into another data type.
        // Example:
        // Convert int to double, double to int, etc.

        

    }
    
}
