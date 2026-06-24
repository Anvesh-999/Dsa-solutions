class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int popIdx = 0;
        for(int num:pushed){
            stack.push(num);
            while(!stack.isEmpty() && stack.peek() ==popped[popIdx]){
                stack.pop();
                popIdx++;
            }
        }
    return stack.isEmpty();
    }
}