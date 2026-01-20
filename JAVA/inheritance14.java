// Inhertance:- it is Process of Aqurinig Properties From Parent Class to Child Class is called Inheritance.
 
// Use Cases.
// Method Overriding.
// Reuse  the Code and Reduce the Duplication.
// Easy maintain.

// 
// Super class - Parent class.
// Sub class - Child Class.
// Extends keyword.

package JAVA;

class parentClass {
    void display() {
        System.out.println("Parent Class Method");
   }
}

class childClass extends parentClass {
    void show() {
        System.out.println("Child Class Method");
    }
}




public class inheritance14 {

    public static void main(String[] args) {
        childClass child1 = new childClass();
        child1.display();

        System.out.println();

        child1.show();
    }
    
}
