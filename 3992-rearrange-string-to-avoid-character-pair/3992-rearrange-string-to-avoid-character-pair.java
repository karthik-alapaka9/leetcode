class Solution {
    public String rearrangeString(String s, char x, char y) {
        int k=0;
        char [] arr=s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==y){
                char temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k++;
            }
        }
        return new String(arr);
    }
}