class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        int n=chars.length;
        while(read<n){
            char currChar=chars[read];
            int count=0;
            while(read<n && chars[read]==currChar){
                count++;
                read++;
            }
            chars[write++]=currChar;
            if(count>1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[write++]=c;
                }
            }
        }
    return write;
    }
}