class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
        }
        int k = 0;
        for(int i = nums1.length; i < nums1.length + nums2.length; i++){
            arr[i] = nums2[k];
            k++;
        }
        Arrays.sort(arr);
        double median = 0;
        if(arr.length % 2 == 0){
            median = (double)(arr[arr.length/2] + arr[(arr.length/2)-1])/2;
            
        }else{
            median = (double)(arr[arr.length/2]);
        }
        return median;
    }
}