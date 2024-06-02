class Solution {
    public ListNode sortList(ListNode head) {
        // applying the mserg sort algorithm for this

        if(head==null || head.next==null){
            return head;
        }

        ListNode mid=find_mid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return merge_sort(left,right);
    }
    private ListNode find_mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        return mid;
    }

    public ListNode merge_sort(ListNode left,ListNode right){
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                current.next=left;
                left=left.next;
            }
            else{
                current.next=right;
                right=right.next;
            }
            current=current.next;
        }

        if(left!=null){
            current.next=left;
        }
        if(right!=null){
            current.next=right;
        }
    return dummy.next;


        
    }
}
