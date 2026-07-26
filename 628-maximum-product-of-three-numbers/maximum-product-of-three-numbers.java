/*class Solution {
    public int maximumProduct(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int p1 = 1;
        for(int i = 0; i < 3; i++){
            p1 *= arr[i];
        }
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int p = 1;
        for(int i = 0; i < 3; i++){
            p *= arr[i];
        }
        int m = Math.max(p1, p);
        return m;
    }
}
*/
class Solution{
    public int maximumProduct(int [] a){
        int n = a.length;
        Arrays.sort(a);
        int p = a[0]*a[1]*a[n-1];
        int p1 = a[n-1]*a[n-2]*a[n-3];
        int m = Math.max(p, p1);
        return m;
    }
}
