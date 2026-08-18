class Solution {
    public int findKthLargest(int[] nums, int k) {
        int res =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(int num : nums){
            pq.offer(num);
        }
        for(int i = 0;i<k;i++){
            res = pq.poll();
        }
        return res;
    }
}
