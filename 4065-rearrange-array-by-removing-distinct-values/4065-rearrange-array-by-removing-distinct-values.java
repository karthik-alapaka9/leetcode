class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer,Integer>map=new  TreeMap<>();
        for(int num: nums){
             map.put(num, map.getOrDefault(num, 0) + 1);
            
        }
        int [] ans=new int[nums.length];
        int index=0;
      while(!map.isEmpty()){
        List<Integer>remove=new ArrayList<>();
        for(Map.Entry<Integer ,Integer> entery: map.entrySet()){
            int value= entery.getKey();
            int fre = entery.getValue();
            ans[index++]=value;
            if(fre==1){
                remove.add(value);
            }else{
                entery.setValue(fre-1);
            }

        }
        for(int value:remove){
            map.remove(value);
        }
      }
      return ans;
    }
}