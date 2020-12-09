package weno.program;

public class CustomNetwork {

    static void dfs(int[][] computers, boolean[][] visited, int start) {
        visited[start][0] = true;

        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !visited[start][i]) {
                dfs(computers, visited, i);
            }
        }

    }

    public static int solution(int n, int[][] computers) {

        int answer = 0;
        boolean[][] visited = new boolean[n][];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]){
                    dfs(computers, visited, i);
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 5;
        int[][] computers = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };


        System.out.println(solution(n, computers));

    }
}
