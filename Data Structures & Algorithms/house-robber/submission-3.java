class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return dfs(nums, 0, memo);
    }

    int dfs(int[] nums, int house, int[]memo){
        if(house>=nums.length){
            return 0;
        }
        if(memo[house]!=-1)return memo[house];
        
        memo[house] = Math.max(dfs(nums, house+1,memo), nums[house]+dfs(nums,house+2, memo));
        return memo[house];
    }
}
