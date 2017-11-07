/*** Monica wants to buy exactly one keyboard and one USB drive from her favorite electronics store. The store sells  different brands of keyboards and  different brands of USB drives. Monica has exactly  dollars to spend, and she wants to spend as much of it as possible (i.e., the total cost of her purchase must be maximal).

Given the price lists for the store's keyboards and USB drives, find and print the amount money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.

Note: She will never buy more than one keyboard and one USB drive even if she has the leftover money to do so.

Input Format

The first line contains three space-separated integers describing the respective values of (the amount of money Monica has),  (the number of keyboard brands) and  (the number of USB drive brands). 
The second line contains  space-separated integers denoting the prices of each keyboard brand. 
The third line contains  space-separated integers denoting the prices of each USB drive brand.
Output Format

Print a single integer denoting the amount of money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.

https://www.hackerrank.com/challenges/electronics-shop/problem
***/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int bestSum = -1;
    

    static int getMoneySpent(Integer[] keyboards, int[] drives, int s){
        // Complete this function
        
        Arrays.sort(keyboards, Collections.reverseOrder());
        Arrays.sort(drives);
   
        for(int i=0, j=0; i<keyboards.length; i++) {
            for(; j<drives.length; j++) {
                if(keyboards[i] + drives[j] > s) {
                    break; //doesnt increment j
                }
                if(keyboards[i] + drives[j] > bestSum) {
                    bestSum = keyboards[i] + drives[j];
                }
            }
        }
        return bestSum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }

}
