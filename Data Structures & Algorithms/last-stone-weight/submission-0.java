class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        for(int stone: stones){
             queue.offer(stone);
        }        
        while(!queue.isEmpty()){
            if(queue.size()==1){
                return queue.poll();
            } 
            int stone1 = queue.poll();
            int stone2 = queue.poll();
            if(stone1 > stone2){
                queue.offer(stone1 - stone2);
            } else if (stone2 > stone1) {
                queue.offer(stone2 - stone1);
            }

        }
        return 0;
        
    }

}