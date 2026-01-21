class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        StringBuilder bucket[]=new StringBuilder[s.length()+1];
        for(int i=0;i<128;i++){
            if(freq[i]>0){
                if(bucket[freq[i]]==null){
                    bucket[freq[i]]=new StringBuilder();
                }
                bucket[freq[i]].append(String.valueOf((char) i).repeat(freq[i]));
            }
        }
        StringBuilder res=new StringBuilder();
        for(int f=s.length();f>=1;f--){
            if(bucket[f]!=null){
                res.append(bucket[f]);
            }
        }
    return res.toString();
    }
}