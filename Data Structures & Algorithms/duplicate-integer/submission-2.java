class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> set = new Hashtable<>();
        for(int num : nums){
            if(set.containsKey(num)){
                return true;
            }
            set.put(num,1);
        }
        return false;
        
    }
}