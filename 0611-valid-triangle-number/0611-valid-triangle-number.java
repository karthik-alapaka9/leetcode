class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int t=nums.length-1; t>=2; t--){
            int a=0;
            int b=t-1;
            while(a<b){
                if(nums[a]+nums[b]>nums[t]){
                  count+=b-a;
                   b--;
                }else{
                    a++;
                }
                
            }
        }
        return count;
    }
}