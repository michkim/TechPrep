/**You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
https://leetcode.com/problems/add-two-numbers/description/

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode p1 = l1;
        ListNode p2 = l2;
        int sum = 0;
        int carry = 0;
        ListNode head;
        ListNode 
        
        //while both have next node
        while((p1 != null) || (p2 != null)) {
            if(!stack.isEmpty()) {
                if(stack.peek() > 9) {
                    carry = 1;
                    stack.push(stack.pop()-10);
                }
            }
            sum = p1.val + p2.val + carry;
            stack.push(sum);
            p1 = p1.next;
            p2 = p2.next;
            carry = 0;
        }
        //takes care of rest of nodes
        while((p1 != null) && (p2 != null)) {
             if(!stack.isEmpty()) {
                if(stack.peek() > 9) {
                    carry = 1;
                    stack.push(stack.pop()-10);
                }
            }
            if((p1 != null) && (p2 == null)) {
                sum = p1.val + carry;
            }
            else {
                sum = p2.val + carry;
            }
            stack.push(sum);
        }
//         System.out.println(stack.peek());
//         ListNode head = new ListNode(stack.pop());
//         ListNode currNode = head;
//         while(!stack.isEmpty()) {
//             System.out.println(stack.peek());
//             currNode.next = new ListNode(stack.pop());
//         }
        
  
//         return head;
    }
        
}