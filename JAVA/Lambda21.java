// A Lambda Expression is a short way to write a method without a name.
// It was introduced in Java 8.
// It is mainly used to implement the method of a functional interface.

// 2️Why do we use Lambda Expression?
// Reduces code length
// Makes code simple and readable
// Replaces anonymous classes
// Supports functional programming...



package JAVA;
interface NumberTester {
    boolean test(int n);
}

public class Lambda21 {
        public static void main(String[] args) {
        NumberTester isEven = n -> n % 2 == 0;
         System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
    }
}
