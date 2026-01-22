package JAVA;
class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Student {
    int id;
    Address address; // Aggregation

    Student(int id, Address address) {
        this.id = id;
        this.address = address;

    }

    void display() {
        System.out.println(id + " " + address.city);
    }
}
 class Aggregation15 {
   
    public static void main(String[] args) {
        Address a = new Address("Delhi");
        Student s = new Student(1, a);
        s.display();
    }
}