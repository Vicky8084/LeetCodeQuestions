class Solution {

    // c -> 5 => 1*1 + 2*2 ==> 5 {(0*0)+(1*1)+(2*2)+(3*3)+(4*4)+(5*5)}
    // c -> 2 => {(0*0)+(1*1)+(2*2)}

    public boolean judgeSquareSum(int c) {
        int sq = (int)Math.sqrt(c);
        int start=0,end=sq;
        while(start<=end){
            long result = (long) start * start + (long) end * end;
            if(result>c){
                end--;
            }else if(result < c){
                start++;
            }else{ 
                return true;
            }
        }
        return false;
    }
}