class Solution {
    public int maxSubArray(int[] nums) {
       int prefix[]=new int [nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int maxSum=nums[0];
        int minPrefix=0;
        for(int i=0;i<nums.length;i++){
            maxSum=Math.max(maxSum,prefix[i]-minPrefix);
            minPrefix=Math.min(minPrefix,prefix[i]);
        }
    return maxSum;
    }
}