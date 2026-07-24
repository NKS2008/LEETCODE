/*
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = j; k < n; k++){
                    int xo = nums[i]^nums[j]^nums[k];
                    if(!list.contains(xo)){
                        list.add(xo);
                    }
                }
            
            }
        }
        return list.size();
    }
}
*/
class Solution{
    static int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        HashSet<Integer> l = new HashSet<>();
        HashSet<Integer> m = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int x = nums[i]^nums[j];
                m.add(x);
            }
        }
        for(int i : m){
            for(int j : nums){
                l.add(i ^ j);
            }
        }
        return l.size();
    }
}