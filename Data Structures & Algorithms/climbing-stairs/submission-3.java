class Solution {
        public int climbStairs(int n) {
                    int[] memo = new int[n + 1];
        // fill with -1 to indicate uncomputed
        java.util.Arrays.fill(memo, -1);
       return memoization(n,0, memo);
    }

    public int memoization(int n, int i, int[]cache){
        if(i>=n) return i==n?1 :0;
        if(cache[i]!=-1)return cache[i];

        int ways = memoization(n, i+1,cache)+ memoization(n, i+2, cache);
        cache[i] = ways;
        return ways;
    }
}
