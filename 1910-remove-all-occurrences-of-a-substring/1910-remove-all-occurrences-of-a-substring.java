class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder stack = new StringBuilder();
        int partLen = part.length();
        for(int i=0;i<s.length();i++){
            stack.append(s.charAt(i));
            if(stack.length() >=partLen){
                String endWindow = stack.substring(stack.length() - partLen);
                if(endWindow.equals(part)){
                    stack.setLength(stack.length() - partLen);
                }
            }
        }
    return stack.toString();
    }
}