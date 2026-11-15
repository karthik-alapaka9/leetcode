class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeMap<Long, Integer>map=new TreeMap<>();
        for(int i=0; i<nums.length; i++){
            long curr=nums[i];
                 Long smaller = map.floorKey(curr);
            Long bigger = map.ceilingKey(curr);

            if (smaller != null && curr - smaller <= valueDiff) {
                return true;
            }

            if (bigger != null && bigger - curr <= valueDiff) {
                return true;
            }

            map.put(curr,map.getOrDefault(curr,0)+1);
            if(i>=indexDiff){
                long oldValue=nums[i-indexDiff];
                int count=map.get(oldValue);
                if(count==1){
                    map.remove(oldValue);
                }else{
                    map.put(oldValue,count-1);
                }
            }
        }
        return false;
    }
}