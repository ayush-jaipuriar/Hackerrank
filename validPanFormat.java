import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern pattern = Pattern.compile("^[A-Z][A-Z][A-Z][A-Z][A-Z]\\d\\d\\d\\d[A-Z]$");
        Matcher m;
        for (int i=0; i<n; i++) {
            m = pattern.matcher(sc.next());
            if (m.find()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
