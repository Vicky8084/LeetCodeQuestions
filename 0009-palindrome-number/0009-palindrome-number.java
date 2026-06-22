class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int cpy=x,rem=0,rev=0;
        while(cpy!=0){
            rem=cpy%10;
            cpy/=10;
            rev=rev*10+rem;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}