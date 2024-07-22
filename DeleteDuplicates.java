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
class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=new ListNode();
        ListNode curr=head;
        prev.next=curr;
        ListNode fut=curr.next;
        head=prev;
        while(fut!=null){
            if(curr.val!=fut.val){
                prev=prev.next;
                curr=curr.next;
                fut=fut.next;
            }else{
                while(curr.val==fut.val){
                    fut=fut.next;
                    if(fut==null){
                        prev.next=null;
                        return head.next;
                    }
                }
                curr=fut;
                fut=fut.next;
                prev.next=curr;

            }
        }
        return head.next;
    }
}
