/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
         int l1=0;
        int l2=0;
        ListNode temp1=h1;
        ListNode temp2=h2;
        while(temp1 != null)
        {
            l1++;
            temp1=temp1.next;
        }

        while(temp2 != null)
        {
            l2++;
            temp2=temp2.next;
        }

        int l=Math.abs(l1-l2);
        temp1=h1;
        temp2=h2;

        while(l > 0)
        {
            if(l1 > l2)
            temp1=temp1.next;
            if(l2 > l1)
            temp2=temp2.next;
            l--;
        } 
        while(temp1 != null && temp2 != null)
        {
            if(temp1 == temp2)
                return temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        } 
    return null;
    }
}