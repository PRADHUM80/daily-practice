//  Parameter
// A parameter is a variable written in the method definition.
// It receives the value.

// Argument
// An argument is the actual value passed to the method.
// It is used when calling the method.

package JAVA;

public class ParametersVSArgument5 {
    static double CalculateArea(double radius) // Parameter
    {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        double area = CalculateArea(5.0);  // Argument
        System.out.println("Area : " + area);
    }
}
