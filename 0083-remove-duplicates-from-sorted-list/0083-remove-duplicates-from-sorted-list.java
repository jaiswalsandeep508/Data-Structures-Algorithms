class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode temp = head;
        ListNode curr = head.next;
        while(curr != null) {
            if(curr.val != temp.val) {
                temp.next = curr;
                temp = curr;
            }
            curr = curr.next;
        }
        temp.next = null;
        return head;
    }
}