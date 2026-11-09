class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int largst=Integer.MIN_VALUE;
        int largstSecond=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<small){
                small=num;
            }
            if(num>=largst){
                largstSecond=largst;
                largst=num;
            }else if(num>largstSecond){
                largstSecond=num;

            }
        }
        return largst+largstSecond-small;
    }
}