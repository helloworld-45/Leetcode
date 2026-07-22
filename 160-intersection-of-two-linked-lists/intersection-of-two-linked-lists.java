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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode p1=headA;
    ListNode p2=headB;
    while(p1!=p2){
        p1=(p1==null)?headB:p1.next;
        p2=(p2==null)?headA:p2.next;
    }
    return p2;
    }
}
//i used two pointer approach, here i have used p1 and p2 to perform traversing the node if both of them cover the same distance and they reach at the same point which is not null then that is the required intersection point otherwise if it reaches null it means there is no any intersection point



// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> ans= new HashSet<>();
//         while(headA!=null){
//             ans.add(headA);
//             headA=headA.next;
//         }
//         while(headB!=null){
//             if(ans.contains(headB))return headB;
//             headB=headB.next;
//         }
//         return null;
//     }
// }