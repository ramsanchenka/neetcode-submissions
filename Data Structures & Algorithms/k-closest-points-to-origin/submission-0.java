class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][]res = new int[k][];
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
    Double.compare(
        euclideanDistance(0, 0, a[0], a[1]),
        euclideanDistance(0, 0, b[0], b[1])
    )
);        for(int[]point : points){
            pq.offer(point);
        }
        for(int i = 0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;
    }

    private double euclideanDistance(int x1, int y1, int x2, int y2) {
    int dx = x1 - x2;
    int dy = y1 - y2;
    return Math.sqrt(dx * dx + dy * dy);
}
}
