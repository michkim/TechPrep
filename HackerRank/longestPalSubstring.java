/*** https://leetcode.com/problems/longest-palindromic-substring/description/ **/

class Solution {
    public String longestPalindrome(String s) {
        
        boolean p1turn = true;
        String longestPal = "";
        int i1 = 0;
        int i2 = s.length()-1;
        char p1 = s.charAt(i1);
        char p2 = s.charAt(i2);
        
        while(i1 < i2) {
            if(p1 == p2) {
                if(isPal(i1+1, i2-1, s)) {
                    String currPal = "";
                    for( int m = i2; m <= i2; m++) {
                        currPal += s.charAt(m);
                    }
                    if(currPal.length() > longestPal.length()) {
                        longestPal = currPal;
                    }
                }
                else {
                    if(p1turn) {
                        i1++;
                        p1turn = false;
                    }
                    else {
                        i2--;
                        p1turn = true;
                    }
                }
            }
        }
        return longestPal;
    }
    //i1+1 i2-1
    private boolean isPal(int i, int j, String s) {
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}