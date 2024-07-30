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
class DeleteDuplicatesEasy {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur=head;
        ListNode prev=head;

        while(cur!=null){
            if(prev.val==cur.val){
                cur=cur.next;

            }else{
                prev.next=cur;
                prev=prev.next;
                cur=cur.next;
            }
        }
        prev.next=cur;
        return head;
    }
}
