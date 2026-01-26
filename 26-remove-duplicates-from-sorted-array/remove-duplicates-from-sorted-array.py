class Solution:
    def removeDuplicates(self, a):
        if not a:
            return 0
        
        k = 1
        for i in range(1, len(a)):
            if a[i] != a[i - 1]:
                a[k] = a[i]
                k += 1
        
        return k
