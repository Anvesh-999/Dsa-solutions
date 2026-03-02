class Solution {
    public int findClosest(int x, int y, int z) {
        int diffxz=Math.abs(x-z);
        int diffyz=Math.abs(y-z);
        if(diffxz<diffyz){
             return 1;
        }else if(diffxz>diffyz){
            return 2;
        }else{
            return 0;
        }
    }
}