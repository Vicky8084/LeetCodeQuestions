class Solution {
    public int search(int[] nums, int target) {
        int si = 0, ei = nums.length-1;
        while(si <= ei){
            int mid = (si + ei)/2;
            if(nums[mid] == target){
                return mid;
            }
            // 0,1,2,3,4,5,6 -> indeces
            //[4,5,6,7,0,1,2]  mid = 3  target = 0
            if(nums[ei] >= nums[mid]){
                if(target > nums[mid] && target <= nums[ei]){
                    si = mid + 1;
                }else{
                    ei = mid - 1;
                }
            }
            if(nums[si] <= nums[mid]){
                if(target < nums[mid] && target >= nums[si]){
                    ei = mid - 1;
                }else{
                    si = mid + 1;
                }
            }
            
        }
        return -1;
    }
}