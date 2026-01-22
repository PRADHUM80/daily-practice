// Composition means strong relationship.
// Child object cannot exist without parent object.

//  Example (Real life):
// House and Room
// Car and Engine





package JAVA;

class Engine {
    Engine() {
        System.out.println("Engine Created");
    }
}

class Car {
    Engine engine; // Composition.

    Car() {
       engine = new Engine(); // created inside car
    }
}


public class Composition16 {
    public static void main(String[] args) {
        Car c = new Car();
    }
    
}
