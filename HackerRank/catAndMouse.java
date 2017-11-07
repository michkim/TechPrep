/**** Two cats named  and  are standing at integral points on the x-axis. Cat  is standing at point  and cat  is standing at point . Both cats run at the same speed, and they want to catch a mouse named  that's hiding at integral point  on the x-axis. Can you determine who will catch the mouse?

You are given  queries in the form of , , and . For each query, print the appropriate answer on a new line:

If cat  catches the mouse first, print Cat A.
If cat  catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
Input Format

The first line contains a single integer, , denoting the number of queries. 
Each of the  subsequent lines contains three space-separated integers describing the respective values of  (cat 's location),  (cat 's location), and  (mouse 's location).

Output Format

On a new line for each query, print Cat A if cat  catches the mouse first, Cat B if cat catches the mouse first, or Mouse C if the mouse escapes.
https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

***/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String whoWon(int A, int B, int C) {
        if (Math.abs(A-C) == Math.abs(B-C)) {
            return "Mouse C";
        }
        else if (Math.abs(A-C) < Math.abs(B-C)) {
            return "Cat A";
        }
        else {
            return "Cat B";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(whoWon(x,y,z));
        }
        
    }
}
