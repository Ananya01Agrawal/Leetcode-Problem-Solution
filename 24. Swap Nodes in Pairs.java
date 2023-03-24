class Solution {
    public ListNode swapPairs(ListNode head) {
        // create a dummy node
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode point=dummy;

        // ensure the nodes we are swapping are not null
        while(point.next!=null &&point.next.next!=null){

            // identify the nodes to swap
            ListNode swap1=point.next;
            ListNode swap2=point.next.next;

            //Actually swap
            swap1.next=swap2.next;
            swap2.next=swap1;

            //prepare for teh next
            point.next=swap2;
            point=swap1;
        }
        // return the start node
         return dummy.next;
    }
}
        
