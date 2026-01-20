package JAVA;

class Student {
    
    int id;
    int age;

    Student(int id, int age) {
        this.id = id;
        this.age = age;
        // Parameterzied 
        System.out.println("Parameterized Constructor");
    }

    // Default

    Student() {
        System.out.println("Default Constructor");
    }

}


public class Constructor13 {
    
    public static void main(String[] args) {
        Student obj = new Student( 5,  21);
    }
}



