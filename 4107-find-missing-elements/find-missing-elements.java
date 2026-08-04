class Solution {
    public List<Integer> findMissingElements(int[] nums) {
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
    }
}