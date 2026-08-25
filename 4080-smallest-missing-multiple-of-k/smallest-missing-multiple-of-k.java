class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for(int i : nums){
            seen.add(i);
        }
        int cur = k;
        while(seen.contains(cur)){
        cur += k;}
        return cur;
    }
}