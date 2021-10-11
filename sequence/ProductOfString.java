package sequence;

import java.util.Scanner;

public class ProductOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        String res=product(sc.nextLine(), sc.nextLine());
        System.out.println(res);
    }

    private static String product(String nextLine, String nextLine1) {
       int num=0;
       int num1=0;
       int n=nextLine.length();
       int n2=nextLine1.length();
        for(int i = 0; i < n; i++) {
            num = num * 10 + (nextLine.charAt(i) - 48);
        }
        for (int j=0;j<n2;j++)
        {
            num1 = num1 * 10 + ((int) nextLine1.charAt(j) - 48);
        }

        return num1*num+"";
    }

}



