package weno.program;

public class Network {

    static void dfs(int[][] computers, boolean[] visited, int start) {
        visited[start] = true;

        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !visited[i]) {
                dfs(computers, visited, i);
            }
        }

    }

    public static int solution(int n, int[][] computers) {

        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]){
                dfs(computers, visited, i);
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 3;
//        int[][] computers = {
//                {1, 1, 1, 0, 0},
//                {0, 0, 1, 0, 0},
//                {0, 1, 1, 1, 0},
//                {0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0}
//        };
        int[][] computers = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 1, 0}
        };

        System.out.println(solution(n, computers));

    }
}
