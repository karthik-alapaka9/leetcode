class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        long range=(long)max-min;
        long bucketSize=Math.max(1L,( range+n-2)/(n-1) );
        int bucketCount=(int) (range/bucketSize)+1;
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        boolean[] used = new boolean[bucketCount];

           for (int num : nums) {

            int index = (int) (
                ((long) num - min) / bucketSize
            );

            bucketMin[index] = used[index]
                ? Math.min(bucketMin[index], num)
                : num;

            bucketMax[index] = used[index]
                ? Math.max(bucketMax[index], num)
                : num;

            used[index] = true;
           }
            int maxGap = 0;
        int previousMax = min;

        for (int i = 0; i < bucketCount; i++) {

            if (!used[i]) {
                continue;
            }

            maxGap = Math.max(
                maxGap,
                bucketMin[i] - previousMax
            );

            previousMax = bucketMax[i];
        }

        return maxGap;
    }
}