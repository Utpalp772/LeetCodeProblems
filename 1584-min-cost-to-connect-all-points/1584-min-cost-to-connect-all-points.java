import java.util.*;
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        boolean[] visited = new boolean[n];

        pq.offer(new int[]{0,0});

        int totalcost = 0;
        int count = 0;

        while(count<n){
            int[] current = pq.poll();
            int cost = current[0];
            int point = current[1];

            if(visited[point]){
                continue;
            }

            visited[point] = true;

            totalcost += cost;

            count++;

            for(int next = 0; next<n; next++){
                if(!visited[next]){
                    int distance = Math.abs(points[point][0] - points[next][0])+Math.abs(points[point][1] - points[next][1]);

                    pq.offer(new int[]{distance, next});
                }
            }
        }
        return totalcost;
    }
}