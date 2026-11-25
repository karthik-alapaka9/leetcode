class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
        int count=0;
        int lastend=Integer.MIN_VALUE;
        for(int pair[]:pairs){
            if(pair[0]>lastend){
                count++;
                lastend=pair[1];
            }
        }
        return count;
    }
}