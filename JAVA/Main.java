// Encapsulation:- Encapsulation  is the Process of Putting data(Variables) And Methods(Function) together inside one Class and Hidding the Internal Details from Other Class.
// The data is hidden from direct access using private.
// Access is provided using public getter and setter methods.

// why:- 
//  Data Security – prevents direct access to variables
//  Data Control – validation using setters
// Flexibility – change internal code without affecting users
// Clean Code – better structure and readability
// Reusability & Maintainability

// Real Life Example:-
// You can’t directly access bank balance (data is hidden)
// You use options like Check Balance / Withdraw (methods)

package JAVA;

 class Encapsulation12 {
    
   private String name;
   private int age;
   private int roll_no;

    // get Methods..

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public int getRoll_no() {
        return roll_no;
    }

    // set Methods..

    public void setName(String name) {
        this.name  = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
 }
    public class Main{
        public static void main(String[] args) 
        {
            Encapsulation12 obj = new Encapsulation12();

            obj.setName("Rahul");
            obj.setAge(21);
            obj.setRoll_no(1);

            System.out.println(obj.getName());
            System.out.println(obj.getAge());
            System.out.println(obj.getRoll_no());
        }
    }
 