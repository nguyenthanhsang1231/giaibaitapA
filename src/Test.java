import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Test {
    static class E {
        int to, weight;
        E(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void dijkstra(int n, int start, List<List<E>> graph) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[1]));
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0];
            int current = cur[1];

            if (current > dist[u]) {
                continue;
            }

            for (E e : graph.get(u)) {
                int v = e.to;
                int w = e.weight;

                if(dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new int[] {v, dist[v]});
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (dist[i] != Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}
