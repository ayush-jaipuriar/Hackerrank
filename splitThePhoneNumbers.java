import java.io.*;
import java.util.*;
import  java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String regex = "([0-9]{1,3})[- ]([0-9]{1,3})[- ]([0-9]{4,10})";
        for(int i =0; i<=n; i++){
            String output =new String();
            String telephone = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(telephone);
            
            while (matcher.find()){
   output ="CountryCode="+matcher.group(1)+",LocalAreaCode="+matcher.group(2)+",Number="+matcher.group(3)+"\n";
            }
            System.out.print(output);           
        }
    }
}
