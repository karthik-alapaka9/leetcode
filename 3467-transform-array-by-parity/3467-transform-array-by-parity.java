class Solution {
    public int[] transformArray(int[] nums) {
        int cur[]=new int[nums.length];
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                count++;
            }
            
        }
           for(int i=0; i<count; i++){
                cur[i]=0;
            }
            for(int i=count; i<nums.length; i++){
                cur[i]=1;
            }
            return cur;
    }
}