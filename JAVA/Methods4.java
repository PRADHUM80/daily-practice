package JAVA;

public class Methods4 {
    // 1.  No input / no output... without parameter and without return type...
    //  static void greet() {
    //     System.out.println("Hello!");
    //  }
    //  public static void main(String[] args) {

    //     greet();
    //  }





    // 2. With Parameter / without Return Type...

    // static void printSum(int a, int b)
    // {
    //     int sum = a + b;
    //     System.out.println("Sum : " + sum);
    // }
    //   public static void main(String[] args) {
    //     printSum(10, 20);
    //     printSum(30, 40);
    //   }


    // 3. Without Parameter / With Return Type..

    //  static int getNumber()
    //  {
    //     return 10;  // return 
    //  }

    //  public static void main(String[] args)
    //  {
    //     int num = getNumber(); // function call
    //     System.out.println("Number : " + num);
    //  }


    // 4. With PArameter / With Return Type..
      static int add(int a , int b) //methods wit parameter and return type..
      {
        return a + b;
        // return a * b;
      }

      public static void main(String[] args)
      {
        int result = add(10,20); // method call
        System.out.println("Result : " + result);
      }


}