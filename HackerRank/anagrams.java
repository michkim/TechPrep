/*** Strings: Making Anagrams 
Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
https://www.hackerrank.com/challenges/ctci-making-anagrams/problem 

Input Format

The first line contains a single string, . 
The second line contains a single string, .

Output Format

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

***/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class anagrams {
    public static int numberNeeded(String first, String second) {
        HashSet<Character> hashset = new HashSet<Character>();
        String large = "";
        String small = "";
        
        
        if(first.length() >= second.length()) {
            large = first;
            small = second;
        }
        else {
            small = first;
            large = second;
        }
        
        for(int i=0; i<large.length(); i++) {
            hashset.add(large.charAt(i));
        }
        
        int anacount=0;
        for(int j=0; j<small.length(); j++) {
            char c = small.charAt(j);
            if(hashset.contains(c)) {
                hashset.remove(c);
                anacount++;
            }
        }
       // int totalchars = 0;
       int totalchars = small.length() + large.length();
        System.out.println("totalchars " + totalchars);
        System.out.println("anacount " + anacount);
         // return hashset.size();
        int ret = totalchars - (2*anacount);
        return ret;
      
        
    }
    

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String a = in.next();
        // String b = in.next();
        String a = "cde";
        String b = "abc";
        System.out.println(numberNeeded(a, b));
        //expected output: 4

        a = "fcrxzwscanmligyxyvym";
		b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		System.out.println(numberNeeded(a, b));
		//expected output: 30
    }
}
