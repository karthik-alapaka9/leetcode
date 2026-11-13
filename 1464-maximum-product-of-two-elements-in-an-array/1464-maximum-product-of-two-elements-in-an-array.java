class Solution {
    public int maxProduct(int[] nums) {
        int nums1=0;
        int nums2=0;
       for(int num:nums){
           if(num>nums1){
             nums2=nums1;
             nums1=num;
           }else if(num>nums2){
             nums2=num;
           }
       }
        return (nums1-1)*(nums2-1);
    }
}