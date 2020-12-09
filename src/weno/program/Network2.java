package weno.program;

import java.util.ArrayList;
import java.util.List;

public class Network2 {

    static boolean[] visit;
    static List<Integer>[] list;
    static int free, group;

    public static int solution(int n, int[][] computers) {
        list = new List[n];
        visit = new boolean[n];

        for (int i=0; i<n; i++)
            list[i] = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int cnt = 0;
            for (int j=0; j<n; j++) {
                if (i != j && computers[i][j] == 1)
                    list[i].add(j);
                if (computers[i][j] == 1) cnt++;
            }
            if (cnt == 1) {
                visit[i] = true;
                free++;
            }
        }


        for (int i=0; i<n; i++) {
            if (!visit[i]) {
                dfs(i);
                group++;
            }
        }

        return free + group;
    }

    static void dfs(int com) {
        visit[com] = true;
        for (int i : list[com])
            if (!visit[i]) dfs(i);
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};

        long starTime = System.nanoTime();

        System.out.println(solution(n, computers));

        long endTime = System.nanoTime();

        Double elapsedTime = (endTime - starTime) / 1000000.0;
        System.out.println(elapsedTime);
    }

}
