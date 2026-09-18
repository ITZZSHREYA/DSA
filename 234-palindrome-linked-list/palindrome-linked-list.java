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
    public boolean isPalindrome(ListNode head) {

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;

        }
        int[] arr = new int[count];
        temp = head;
        int x = 0;
        while (temp != null && x < count) {
            arr[x] = temp.val;
            //System.out.println(arr[i]);
            temp = temp.next;
            x++;
        }

        
        int[] arr2 = new int[count];
        x = 0;
        int y=count-1;

       
            while (x < count && y>=0) {
                arr2[x] = arr[y];
                x++;
                y--;
            }
        int z=0;
        for(int i=0;i<count;i++)
        {
            if(arr2[i]==arr[z])
            {
                z++;
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
        
    

    }
}