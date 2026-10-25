class Solution {
    public int countDigitOne(int n) {
        int count=0;
        for(int p=1; p<=n; p*=10){
            long dev=p*10;
            long h=n/dev;
            long cur=(n/p)%10;
            long l=n%p;
            if(cur==0){
                count+=h*p;
            }else if(cur==1){
                count+=h*p+l+1;
            }else{
                count+=(h+1)*p;
            }
        }
        return (int) count;
    }
}