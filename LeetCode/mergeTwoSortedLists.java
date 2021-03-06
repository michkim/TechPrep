/**
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) {
            return null; //if both lists empty
        }
        else if(l1==null) {
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        
        ListNode dummyhead = new ListNode(0);
        ListNode prev = dummyhead;
        
        while(l1!=null && l2!=null) {
            if(l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            }
            else {
                prev.next = l2;
                l2 = l2.next;
            }        
            prev = prev.next; //iterate to next
        }
        
        if(l1 != null) {
            prev.next = l1;
        }
        else if(l2 != null) {
            prev.next = l2;
        }
        return dummyhead.next;
    }
}
