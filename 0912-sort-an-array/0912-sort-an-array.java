class Solution {
    public int[] sortArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-min]++;
        }
        int idx=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                nums[idx]=i+min;
                idx++;
                freq[i]--;
            }
        }
    return nums;
    }
}