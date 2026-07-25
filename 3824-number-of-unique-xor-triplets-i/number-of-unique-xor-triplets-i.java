/*
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        HashSet<Long> m = new HashSet<>();
        HashSet<Long> o = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = i ; j < n; j++){
                long x = nums[i] ^ nums[j];
                m.add(x);
            }
        }
        for(int i = 0; i < n; i++){
            for(long x : m){
                o.add(x ^ nums[i]);
            }
        }
        return o.size();
    }
}

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

class Solution{
    static int uniqueXorTriplets(int[] nums){
        int n = nums.length;int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }
        int size = 1;
        while (size <= max) {
            size <<= 1;
        }
        boolean [] x = new boolean[size];
        boolean [] y = new boolean[size];
        for(int i = 0; i < n;i++){
            for(int j = i;j < n; j++){
                x[nums[i] ^ nums[j]] = true;
            }
        }
        int c = 0;
        for(int i = 0; i < size; i++){
            if(x[i]){
                for(int j : nums)
                    y[i ^ j] = true;
            }
        }
        for(boolean a : y){
            if(a) c++;
        }
        return c;
    }
}
*/
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if (n < 3) return n;
        int ans = 1;
        while (ans <= n) {
            ans <<= 1;
        }
        return ans;
    }
}