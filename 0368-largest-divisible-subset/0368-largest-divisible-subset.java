class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int dp[]=new int[n];
        int parent[]=new int[n];
        int max=1;
        int last=0;
        for(int i=0; i<n; i++){
            dp[i]=1;
            parent[i]=-1;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i]%nums[j]==0){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        parent[i]=j;
                    }
                }
            }
            if(dp[i]>max){
                max=dp[i];
                last=i;
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        while(last!=-1){
            list.add(nums[last]);
            last=parent[last];


        }
        Collections.reverse(list);
        return list;
    }
}