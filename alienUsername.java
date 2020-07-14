import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern pattern = Pattern.compile("^[_.]\\d+[a-zA-Z]*_?$");
        Matcher m;
        for (int i=0; i<n; i++) {
            String st = sc.next();
            m = pattern.matcher(st);
            if (m.find()) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
