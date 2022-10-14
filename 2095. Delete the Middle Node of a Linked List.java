class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // base case
        if(head==null) return null;
        if(head.next==null) return null;
        // initialize slow and head pointer to reach the middle of the linked list
        ListNode slow=head;
        ListNode fast=head;
        // find the middle and previous of the middle
        ListNode prev=null;
        // to store the previous of slow pointer
        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        //Delete the middle node
        prev.next=slow.next;
        return head;
    
        
    }
}
