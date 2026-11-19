class Solution {
    public int absDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int small=0;
        int largest=0;
        for(int i=0; i<k; i++){
            small+=nums[i];
        }
        for(int i=n-k; i<n; i++){
            largest+=nums[i];
        }
        return Math.abs(small-largest);
    
    }
}