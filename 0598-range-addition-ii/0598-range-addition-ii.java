class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for(int check[]:ops){
            m=Math.min(m,check[0]);
            n=Math.min(n,check[1]);
            
        }
        return m*n;
    }
}