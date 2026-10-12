class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> set = new Hashtable<>();
        for(int num : nums){
            if(set.containsKey(num)==false){
                set.put(num,1);
                
            }else{
                return true;
            }
            
        }
        return false;
        
    }
}