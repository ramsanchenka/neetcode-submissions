class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        dfs(nums,new ArrayList(),res,0);
        return res;
    }

    private void dfs(int[] nums, List<Integer> sub, List<List<Integer>> res, int i){
        if(i>= nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        dfs(nums, sub, res, i+1);
        sub.remove(sub.size()-1);
        dfs(nums, sub, res, i+1);

    }
}
