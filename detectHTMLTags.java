import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextLine();            
        }
        SortedSet<String> tags = new TreeSet<String>(); 
        for(int i=0;i<n;i++){
            Pattern p = Pattern.compile("<\\b(\\w+)\\b[^>]*>");
            Matcher m = p.matcher(s[i]);
            while(m.find()){
               tags.add(m.group(1));                
            }
        }       
      Iterator itr = tags.iterator();      
         while(itr.hasNext()) {
         Object element = itr.next();
         if(itr.hasNext()==false){
             System.out.print(element);
         }
         else{
             System.out.print(element+";");
         }
      }
    }
}
