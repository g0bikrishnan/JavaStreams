package unchecked.exception;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers ");
      divide(sc.nextInt(),sc.nextInt());
    }
    private static void divide(int nextInt, int nextInt1) {
        try {
            System.out.println(nextInt / nextInt1);
        }
        catch (Exception e)
        {
            System.out.println("the Divisor is must be non zero");
        }

    }
}

