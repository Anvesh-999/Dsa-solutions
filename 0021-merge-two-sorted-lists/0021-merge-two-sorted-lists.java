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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first=list1;
        ListNode second=list2;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(first!=null && second !=null){
            if(first.val <=second.val){
                curr.next=first;
                first=first.next;
            }else{
                curr.next=second;
                second=second.next;
            }
            curr=curr.next;
        }
        if(first !=null){
            curr.next=first;
        }else{
            curr.next=second;
        }
    return dummy.next;
    }
}