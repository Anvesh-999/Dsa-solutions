class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res=new ArrayList<>();
        int max=0;
        for(int c:candies){
            max=Math.max(max,c);
        }
        for(int c:candies){
            res.add(c+extraCandies>=max);
        }
    return res;
    }
}