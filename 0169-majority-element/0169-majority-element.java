class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
                count=1;
            }else if(candidate==nums[i]){
                count++;
            }else{
                count--;
            }
        }
      count=0;
      for(int num:nums)  {
        if(candidate==num){
            count++;
        }
      }
    return (count>nums.length/2)? candidate:-1;
    }
}