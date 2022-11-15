class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null)
            return head;
        
        ListNode odd = head , even = head.next, joinEven = even;
        
        while( even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = joinEven;
        return head;
        
    }
}
