// An abstract class in Java is a class that:
// Cannot be instantiated (you cannot create its object)
// Can have abstract methods (methods without body)
// Can also have normal (concrete) methods
// It is used when you want to force child classes to implement some methods.

// Keyword used: abstract

//  Abstract Class               | Interface                      |

//  Can have constructor         | Cannot have constructor        
//  Can have normal methods      | Methods are abstract (default) 
//  Supports partial abstraction | Supports full abstraction      
// Uses `extends`               | Uses `implements`              


package JAVA;


abstract class Animal
{
    // ABstract Method (no body)..
    abstract void sound();

    // regular method..
    void sleep()
    {
        System.out.println("Animal is Sleeping..");
    }

}
    class Dog extends Animal
    {
 
        // implementing abstract method
        @Override
        void sound()
        {
            System.out.println("Dog Barks");
        }
    }



public class Abstract20 {
    
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }


}
