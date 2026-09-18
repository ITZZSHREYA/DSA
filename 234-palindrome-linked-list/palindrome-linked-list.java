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
    public ListNode reverse(ListNode middle)
    {
        ListNode temp=middle;
        ListNode prev=null;

        while(temp!=null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        
        ListNode slow=head,fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        ListNode middle=slow;

        ListNode secrev=reverse(middle);
        ListNode temp2=head;
        
        while(temp2!=middle)
        {
            if(temp2.val==secrev.val)
            {
                temp2=temp2.next;
                secrev=secrev.next;
            }
            else
            {
                return false;
            }
        }
        return true;



    }
}