// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] lp = new int[n];
        int[] rp = new int[n];

        lp[0] = 1;
        for(int i=1; i<n; i++){
            lp[i] = lp[i - 1] * nums[i- 1];
        }

        rp[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            rp[i] = rp[i + 1] * nums[i + 1];
        }

        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = lp[i] * rp[i];
        }

        return result;
    }
}
