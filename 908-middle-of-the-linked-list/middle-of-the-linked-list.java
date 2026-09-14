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
    public ListNode middleNode(ListNode head) {
        
        int count=0;
        ListNode temp=head;
        ListNode node=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int n=count/2;
        for(int i=0;i<n;i++)
        {
            node=node.next;

        }
        return node;
    }
}