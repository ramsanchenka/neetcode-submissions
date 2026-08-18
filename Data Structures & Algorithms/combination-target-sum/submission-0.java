class Solution {
    List<List<Integer>> res ;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList();
        findTargetValue(nums, target,new ArrayList(), 0);
        return res;
    }

    private void findTargetValue(int[] nums, int target, List<Integer> curr, int index){
        if(target == 0){
            res.add(new ArrayList(curr));
            return;
        }
        if (target<0 || index >=nums.length){
            return;
        }
        curr.add(nums[index]);
        findTargetValue(nums, target - nums[index], curr, index);
        curr.remove(curr.size()-1);
        findTargetValue(nums, target,curr, index +1);
    }
}
