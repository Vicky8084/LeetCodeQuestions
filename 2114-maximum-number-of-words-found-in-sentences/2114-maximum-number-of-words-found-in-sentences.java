class Solution {
    public int mostWordsFound(String[] sentences) {
        int spaces=0; 
// ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]        
        for(int i=0;i<sentences.length;i++){
            String ch=sentences[i];
            int count=1;
            for(int j=0;j<ch.length();j++){
                if(ch.charAt(j)==' '){
                    count++;
                }
            }
            if(count>spaces){
                spaces=count;
            }
        }
        return spaces;
    }
}