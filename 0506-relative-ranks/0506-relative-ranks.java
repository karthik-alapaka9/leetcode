class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        Integer index[]=new Integer[n];
        for(int i=0; i<n; i++){
            index[i]=i;
        }
      Arrays.sort(index,(a,b)->Integer.compare(score[b],score[a]));
        String  ans[]=new String[n];
        for(int r=0; r<n; r++){
        int ori= index [r];
        if(r==0){
          ans[ori]="Gold Medal";
        }else if(r==1){
           ans[ori]="Silver Medal";
        }else if(r==2){
           ans[ori]="Bronze Medal";
        }else{
            ans[ori]=String.valueOf(r+1);
        }
          
        }
        return ans;
    }
}