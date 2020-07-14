import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SortedSet<String> arr = new TreeSet<String>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            Pattern p = Pattern.compile("\\b[\\w\\.]+@[\\w\\.]+\\b");
            Matcher m = p.matcher(s);
            while(m.find()){
                arr.add(m.group());
            }
        }
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            if(itr.hasNext()==false){
                System.out.print(element);
            }
            else System.out.print(element+";");
        
        }
   
    }

}
