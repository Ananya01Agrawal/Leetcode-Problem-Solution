class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // create a dummy head node
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode curr=dummy;
        while(curr.next!=null){
            // check if the value matches
            if(curr.next.val==val)
                curr.next=curr.next.next;
            else
            curr=curr.next;
        }
        // Return the head
        return dummy.next;

        
    }
}
