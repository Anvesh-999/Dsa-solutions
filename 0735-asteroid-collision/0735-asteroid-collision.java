class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int ast: asteroids){
            boolean alive = true;
            while(!stack.isEmpty() && stack.peek() >0 && ast <0){
                 int top = stack.peek();
                 int absAst =-ast;
                 if(top<absAst){
                    stack.pop();
                    continue;
                 }else if(top == absAst){
                    stack.pop();
                    alive = false;
                    break;
                 }else{
                    alive= false;
                    break;
                 }
            }
            if(alive) stack.push(ast);
        }
        int [] res=new int[stack.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]= stack.pop();
        }
        return res;
    }
}