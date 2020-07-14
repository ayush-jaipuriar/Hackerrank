import java.util.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] inputs = new String[n];
        for(int i = 0; i < n; i++) {
            inputs[i] = scan.nextLine();
        }
        
        // Number of queries
        int q = Integer.parseInt(scan.nextLine());
        
        // Count of number of occurrences of word
        int occurrences;
        
        // Process queries
        while(q-- > 0) {
            // Get query sub-word
            
            String subword = scan.next();
            // Initialize counter
            occurrences = 0;
            
            Pattern p = Pattern.compile("\\w" + subword + "\\w");
            
            // Check all sentences and count occurrences
            for(String sentence : inputs) {
                Matcher m = p.matcher(sentence);
                while(m.find()) {
                    occurrences++;
                }
            }
            
            // Print number of occurrences
            System.out.println(occurrences);
        }
        scan.close();
    }
}
