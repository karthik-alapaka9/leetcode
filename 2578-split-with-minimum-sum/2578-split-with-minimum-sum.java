class Solution {
    public int splitNum(int num) {
        int num1=0,num2=0;
        
        String s=String.valueOf(num);
        char []digits=s.toCharArray();
        Arrays.sort(digits);
        for(int n=0; n<digits.length; n++){
            int digit=digits[n]-'0';
            if(n%2==0){
                num1=num1*10+digit;
            }else{
                num2=num2*10+digit;
            }
        }
        return num1+num2;
    }
}