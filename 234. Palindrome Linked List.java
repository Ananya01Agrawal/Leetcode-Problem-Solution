class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;

        ListNode fast=head;
        ListNode reversed=null;

        // found the middle of the linkedList
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //Reverse the secodn half of the Lined list
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=reversed;
            reversed=slow;
            slow=next;

        }
        // compare the  first and second half
        while (reversed != null) {
            if (head.val != reversed.val) return false;
            head = head.next;
            reversed = reversed.next;
        }

        return true;
    }
}




 
