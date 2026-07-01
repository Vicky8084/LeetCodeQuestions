class Solution {
    public String trafficSignal(int timer) {
        String flag="";
        if(timer == 0){
            flag="Green";
        }else if(timer ==30){
            flag="Orange";
        }else if(timer>30 && timer<=90 ){
            flag="Red";
        }
        else{
            flag="Invalid";
        }
        return flag;
    }
}