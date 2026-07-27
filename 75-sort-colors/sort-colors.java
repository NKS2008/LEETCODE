class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                while(arr[i] < arr[j]){
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                }
            }
        }
    }
}