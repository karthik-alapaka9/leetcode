class Solution {
    public int findClosest(int x, int y, int z) {
        int dis1=Math.abs(x-z);
        int dis2=Math.abs(y-z);
        int ans=0;
        if(dis1<dis2){
            ans=1;
        }else if(dis2<dis1){
            ans=2;
        }else{
            return 0;
        }
        return ans;
    }
}