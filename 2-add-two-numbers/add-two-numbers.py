class Solution:
    def addTwoNumbers(self, a, b):
        d = ListNode(0)
        c = d
        s = 0
        
        while a or b or s:
            if a:
                s += a.val
                a = a.next
            if b:
                s += b.val
                b = b.next
            
            c.next = ListNode(s % 10)
            c = c.next
            s //= 10
        
        return d.next
