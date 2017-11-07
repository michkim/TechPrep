import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap = new HashMap<String,Integer>();
    Map<String, Integer> noteMap = new HashMap<String,Integer>();
    
    public Solution(String magazine, String note) {
        String[] mag = magazine.split(" ");
        String[] not = note.split(" ");
        for(String m : mag) {
            //System.out.println(m);
            if(magazineMap.containsKey(m)) {
                //System.out.println("++ m");
                magazineMap.put(m, magazineMap.get(m) + 1);
            }
            else {
                //System.out.println("put new m");
                magazineMap.put(m,1);
            }
        }
        for(String n : not) {
            if(noteMap.containsKey(n)) {
                noteMap.put(n, noteMap.get(n) + 1);
            }
            else {
                noteMap.put(n,1);
            }
        }
    }
    
    public boolean solve() {
        for(String word : noteMap.keySet()) {
            if(magazineMap.get(word)==null) {
                return false;
            }
             if(noteMap.get(word)!=magazineMap.get(word)) {
                 //System.out.println(noteMap.get(word));
                 //System.out.println(magazineMap.get(word));
                 return false;
             }
        }
        return true;
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
