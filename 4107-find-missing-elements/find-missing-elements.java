class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        /*
        List<Integer> ne = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int c = nums[0];
        for(int i = 0; i < n; c++, i++){
            if(c < nums[i]){
                ne.add(c);
                i--;
            }
        }
        return ne;
        */
        List<Integer> set = new ArrayList<>();
        int mi = Integer.MAX_VALUE;
        int ma = Integer.MIN_VALUE;
        for(int num : nums){
            mi = Math.min(mi, num);
            ma = Math.max(ma, num);
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = mi + 1; i < ma ; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}