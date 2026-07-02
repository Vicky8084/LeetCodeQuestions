class Solution {
    public int digitFrequencyScore(int n) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // while(n!=0){
        //     int rem=n%10;
        //     n=n/10;
        //     if(!map.containsKey(rem)){
        //         map.put(rem,1);
        //     }else{
        //         map.put(rem,map.get(rem)+1);
        //     }
        // }
        // int sum=0;
        // for(Integer key : map.keySet()){
        //     sum+=map.get(key)* key;
        // }
        // return sum;
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        sum+=n;
        return sum;
    }
}