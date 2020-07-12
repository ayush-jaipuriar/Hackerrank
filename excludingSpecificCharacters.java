/*
You have a test string .
Your task is to write a regex that will match  with the following conditions:

S must be of length 6.
First character should not be a digit 
Second character should not be a lowercase vowel
Third character should not be b, c, D or F.
Fourth character should not be a whitespace character ( \r, \n, \t, \f or <space> )
Fifth character should not be a uppercase vowel 
Sixth character should not be a . or , symbol.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[\\D][^(aeiou)][^cDF][\\S][^AEIOU][^.,]$"); // Use \\ instead of using \ 
    
    }
}

class Regex_Test {
