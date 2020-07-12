/*
You have a test string S.
Your task is to write a regex that will match  using the following conditions:

S must be of length equal to 45.
The first  characters should consist of letters(both lowercase and uppercase), or of even digits.
The last  characters should consist of odd digits or whitespace characters.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[a-zA-Z02468]{40}[\\s13579]{5}$"); // Use \\ instead of using \ 
    
    }
}

class Regex_Test {
