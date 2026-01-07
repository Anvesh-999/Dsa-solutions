class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth=0;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            max_wealth=Math.max(max_wealth,sum);
            sum=0;
        }
    return max_wealth;
    }
}