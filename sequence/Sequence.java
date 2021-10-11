package sequence;

import java.util.Scanner;

public class Sequence {
    public static int longestUniqueSubsttr(String str)
    {
    int n = str.length();
    int res = 0;
    for(int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            if (CheckDistinct(str, i, j))
                res = Math.max(res, j - i + 1);
        }
    }
    return res;
}
    public static Boolean CheckDistinct(String str,
                                      int i, int j)
    {

        // Note : Default values in visited are false
        boolean[] visited = new boolean[26];

        for(int k = i; k <= j; k++)
        {
            if (visited[str.charAt(k) - 'a'])
                return false;

            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String str=sc.nextLine();
        System.out.println("The input string is " + str);
        int len = longestUniqueSubsttr(str);
        System.out.println(len);
    }

}
