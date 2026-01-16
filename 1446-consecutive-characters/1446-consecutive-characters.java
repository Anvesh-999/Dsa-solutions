class Solution {
    public int maxPower(String s) {
        int count=1,max=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                max=Math.max(max,count);
            }else{
                count=1;
            }
        }
    return max==0? 1:max;
    }
}