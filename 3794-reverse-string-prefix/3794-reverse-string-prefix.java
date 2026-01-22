class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder str=new StringBuilder(s);
        int i=0,j=k-1;
        while(i<=j){
            char l=str.charAt(i),r=str.charAt(j);
            str.setCharAt(i,r);
            str.setCharAt(j,l);
            i++;
            j--;
        }
    return str.toString();
    }
}