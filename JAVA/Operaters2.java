package JAVA;
public class Operaters2 {

    public static void main(String[] args)
    {
        //1.  Arithmetic Operators..
        int a = 50;
        int b = 30;

        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulo


        // 2. Assignment Operators..
        int c = 20;
        c += 10; // c = c + 10
        System.out.println("c = " + c);



        // 3. Comparision Operators..
        int x = 15;
        int y = 25;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);


        // 4. Logical Operators..
        boolean p = true;
        boolean q = false;
        System.out.println(p && q); // and returns true if both condition is true
        System.out.println(p || q); // OR returns true if any one condition is true
        System.out.println(!p); // not reverses the boolean value


        // 5. Unary Operators..
        int m = 5;
        System.out.println(m++);
        System.out.println(m--);
        System.out.println(++m);
        System.out.println(--m);


        // 6. Ternary Operator..
        int age = 20;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(eligibility);

        
        // 7. Bitwise Operators..
        int p1 = 5; // 0101 in binary
        int p2 = 3; // 0011 in binary
        System.out.println("p1 & p2 = " + (p1 & p2)); //AND
        System.out.println("p1 | p2 = " + (p1 | p2)); //OR
        System.out.println("p1 ^ p2 = " + (p1 ^ p2)); //XOR
        System.out.println("~p1 = " + (~p1)); //NOT


        
    }
}
