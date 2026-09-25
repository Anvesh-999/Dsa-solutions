class Solution {
    public int missingNumber(int[] nums) {
        int tol=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            tol+=nums[i];
        }
        return n*(n+1)/2-tol;
    }
}