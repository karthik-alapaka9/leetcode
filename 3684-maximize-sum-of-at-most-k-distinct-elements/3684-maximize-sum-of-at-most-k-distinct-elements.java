class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        int ans[]=new int [k];
        for(int i=n-1; i>=0; i--){
            if(i<n-1 && nums[i]==nums[i+1]){
                continue;
            }
            ans[count]=nums[i];
            count++;
            if(count==k){
                break;

            }
           
        }
         return Arrays.copyOf(ans,count);
    }
}