/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansHead = new ListNode(0);
        ListNode ansTail = ansHead;
        int carry = 0;

        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + carry;
            int digit = sum%10;
            carry = sum/10;

            ListNode temp = new ListNode(digit);
            ansTail.next = temp;
            ansTail = temp;

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null){
            int sum = l1.val + carry;
            int digit = sum%10;
            carry = sum/10;
            ListNode temp = new ListNode(digit);
            ansTail.next = temp;
            ansTail = temp;

            l1 = l1.next;
        }  

        while(l2!=null){
            int sum = l2.val + carry;
            int digit = sum%10;
            carry = sum/10;
            ListNode temp = new ListNode(digit);
            ansTail.next = temp;
            ansTail = temp;

            l2 = l2.next;
        }

        if(carry==1){
            ListNode temp = new ListNode(1);
            ansTail.next = temp;
            ansTail = temp;
        }

        return ansHead.next;
    }
}