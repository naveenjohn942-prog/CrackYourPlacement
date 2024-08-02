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
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode();
        ListNode ans = head;
        while(temp1!=null&&temp2!=null){
            if(temp1.val>temp2.val){
                ans.next=temp2;
                temp2=temp2.next;
            }else{
                ans.next=temp1;
                temp1=temp1.next;
            }
            ans=ans.next;
        }
        while(temp1!=null){
            ans.next=temp1;
            ans=ans.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            ans.next=temp2;
            ans=ans.next;
            temp2=temp2.next;

        }
        return head.next;
    }
}
