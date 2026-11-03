class Solution {
    public int hIndex(int[] citations) {
        int h=0;
        Arrays.sort(citations);
        for(int i=citations.length-1; i>=0; i--){
            int find=citations.length-i;
            if(citations[i]>=find){
              h=find;
            }else{
                break;
            }
        }
        return h;
    }
}