package JAVA;

public class Static11 {
    
    static int x;

    // Static Block
    static {
        x = 10;
        System.out.println("Static block called");
    }

    // Static Method
    static void show() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        show();
    }
}


