class Solution {
    private Map<String,List<Integer>> memo = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if(memo.containsKey(expression)){
            return memo.get(expression);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                List<Integer> leftRes=diffWaysToCompute(expression.substring(0,i));
                List<Integer> rightRes=diffWaysToCompute(expression.substring(i+1));
                for(int left:leftRes){
                    for(int right:rightRes){
                        if(ch=='+'){
                            res.add(left+right);
                        }else if(ch=='-'){
                            res.add(left-right);
                        }else if(ch=='*'){
                            res.add(left*right);
                        }
                    }
                }
            }
        }
        if(res.isEmpty()){
            res.add(Integer.parseInt(expression));
        }
        memo.put(expression,res);
    return res;
    }
}