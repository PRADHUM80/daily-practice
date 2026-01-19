// Encapsulation :- Keep your Seceret safe.
// Inheritance :- Pass down your skill.
// Polymorphism :- One name many forms.
// Abstraction :- Hide the tricky details.

package JAVA;

public class Oop6 {
    // Encapsulation :- Keep your Seceret safe.
    static class Person {
        private String name; // private variable

        // public getter method
        public String getName() {
            return name;
        }

        // public setter method
        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        System.out.println("Name: " + p.getName());
    }
    
}
