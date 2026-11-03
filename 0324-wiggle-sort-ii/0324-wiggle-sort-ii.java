class Solution {
    public void wiggleSort(int[] nums) {
       Arrays.sort(nums);
       int []temp=new int [nums.length];
       int left=(nums.length-1)/2;
       int right=nums.length-1;
       for(int i=0; i<nums.length; i++){
           if(i%2==0){
             temp[i]=nums[left];
             left--;
           }else{
           temp[i]=nums[right];
            right--;
           }
       }
       
      for(int i=0; i<nums.length; i++){
           nums[i]=temp[i];
       }
    }
}