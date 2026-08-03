class Solution {
    public String lastNonEmptyString(String s) {
        int []count=new int [26];
        int []lastIdx=new int [26];
        int maxFreq=0;
        for(int i=0;i<s.length();i++){
            int charIdx=s.charAt(i)-'a';
            count[charIdx]++;
            lastIdx[charIdx]=i;
            maxFreq=Math.max(maxFreq,count[charIdx]);
        }
        List<Integer> indices=new ArrayList<>();

        for(int i=0;i<26;i++){
            if(count[i]==maxFreq){
                indices.add(lastIdx[i]);
            }
        }
        Collections.sort(indices);
        StringBuilder res=new StringBuilder();
        for(int idx:indices){
            res.append(s.charAt(idx));
        }
        return res.toString();
    }
}