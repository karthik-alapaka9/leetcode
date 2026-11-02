class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int index =nums.length-1;
        int find=index-(k-1);
        return nums[find];
    }
}