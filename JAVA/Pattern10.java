package JAVA;

public class Pattern10 {
    
    public static void main(String[] args) {

        // for(int i =1; i <= 4; i++) {
        //     for(int j = 1; j <= 4; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        //Example 2..
        // for(int i =1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= i; j++) 
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Example 3..
        //         for(int i =1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= i; j++) 
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // Example 4..
        //         for(int i =5; i >= 1; i--)
        // {
        //     for(int j = 1; j <= i; j++) 
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Example 5..
        // for(int i =5; i >= 1; i--)
        // {
        //     for(int j = 1; j <= i; j++) 
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // Example 6..
                for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 4-i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
