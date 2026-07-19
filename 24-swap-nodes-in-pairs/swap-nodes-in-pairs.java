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
    public ListNode swapPairs(ListNode head) {
        //edge case 
        if(head==null || head.next==null)return head;
        ListNode prev=null;
        ListNode first=head;
        ListNode second=head.next;
        while(first!=null && second!=null){
            ListNode third=second.next;
            second.next=first;
            first.next=third;
            if(prev!=null) prev.next=second;
            else head=second;

            //updation
            prev=first;
            first=third;
            if(third!=null)second=third.next;
            else second=null;
        }
        return head;
    }
}
/*
I solved this iteratively without using a dummy node. I maintained four pointers: prev, first, second, and third. For each adjacent pair, I updated the links to swap the two nodes, connected the previous swapped pair to the current one, and moved the pointers to the next pair. The solution traverses the list once, resulting in O(n) time complexity and O(1) extra space.

*/