    class Solution {
        public boolean isSorted(LinkedList<Integer> list){
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)) return false;
            }
            return true;
        }
        public int minimumPairRemoval(int[] nums) {
            LinkedList<Integer> list =new LinkedList<>();
            for(int num:nums){
                list.add(num);
            }
            int ops=0;
            while(!isSorted(list)){
                int minSum=Integer.MAX_VALUE;
                int idx=0;
                for(int i=0;i<list.size()-1;i++){
                int sum=list.get(i)+list.get(i+1);
                if(sum<minSum){
                    minSum=sum;
                    idx=i;
                }
                }
                ops++;
                list.set(idx,minSum);
                list.remove(idx+1);
            }
        return ops;
        }
    }