class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp = head;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        while(list1!=null && list2!=null){
            int value = Math.min(list1.val,list2.val);
            ListNode node = new ListNode(value);

            if(head==null){
                head = node;
                temp = node;
            }else {
                temp.next = node;
                temp = node;
            }
            if(list1.val<list2.val){
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
        }
        if(list1 == null){
            temp.next = list2;
        }

        if(list2 == null){
            temp.next = list1;
        }

        return head;
    }
}