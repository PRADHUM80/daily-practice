// Polymorphism means
// one name, many forms
// In Java, it means:
// Same method name
// Different behavior

// Real-Life Example
// A person:

// At home → Father
// At school → Teacher
// At bank → Customer
// Same person, different roles → Polymorphism

//  Types of Polymorphism in Java

// Java has two types:

// 1️ Compile-Time Polymorphism (Method Overloading)
// (Method Overloading)
// Meaning
// Same method name
// Different parameters
// Decided at compile time


// 2️ Run-Time Polymorphism (Method Overriding)
// (Method Overriding)
// Meaning
// Parent and child class
// Same method name & parameters
// Decision made at runtime
// Achieved using inheritanc





package JAVA;

public class CompilePolymer18 {
      int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompilePolymer18 m = new CompilePolymer18();

        System.out.println(m.add(10, 20));
        System.out.println(m.add(10, 20, 30));
        System.out.println(m.add(5.5, 2.5));
    }
}

