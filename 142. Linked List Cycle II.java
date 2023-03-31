public class Solution {
    public ListNode detectCycle(ListNode head) {
        // initialize both to the head of the linked list
        ListNode fast = head;
        ListNode slow = head;
        ListNode start=null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;// moving the two nodes
            slow = slow.next;// moving the one node
            if (fast == slow){// if both fast and slow are equal
                start = head;
                while(start!=slow){
                    start = start.next;
                    slow = slow.next;
                }
                break;
            }
        }
        return start;
    }
}
