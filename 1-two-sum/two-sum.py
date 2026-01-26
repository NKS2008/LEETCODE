class Solution:
    def twoSum(self, a, t):
        m = {}
        for i, x in enumerate(a):
            y = t - x
            if y in m:
                return [m[y], i]
            m[x] = i
