package weno.program;

public class Network {

    static void dfs(int[][] computers, boolean[] chk, int start) {
        chk[start] = true;

        for(int i = 0; i < computers.length; i++) {
            if(computers[start][i] == 1 && !chk[i]) {
                dfs(computers, chk, i);
            }
        }

    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(!chk[i]) {
                dfs(computers, chk, i);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};
        System.out.println(solution(n, computers));
    }

}
