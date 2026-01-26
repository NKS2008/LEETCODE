class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode d = new ListNode(0);
        ListNode c = d;
        int s = 0;
        
        while (a != null || b != null || s != 0) {
            if (a != null) {
                s += a.val;
                a = a.next;
            }
            if (b != null) {
                s += b.val;
                b = b.next;
            }
            
            c.next = new ListNode(s % 10);
            c = c.next;
            s /= 10;
        }
        return d.next;
    }
}
