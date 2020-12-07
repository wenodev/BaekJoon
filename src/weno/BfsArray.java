package weno;

public class BfsArray {

    static class BFS{
        int N = 0;
        int M = 0;
        int[][] arr;
        boolean[][] visited;
    }



    public static void main(String[] args) {
        BFS bfs = new BFS();

        bfs.arr = new int[][]{
                {1,1,1,1,1,1},
                {1,0,1,0,1,0},
                {1,0,1,0,1,1},
                {1,1,1,0,1,1}
        };
        bfs.visited = new boolean[6][4];

        for (int i = 0; i < bfs.visited.length; i++) {
            for (int j = 0; j < bfs.visited[0].length; j++) {
                bfs.visited[i][j] = false;
            }
        }

        bfs.visited[0][0] = true;

    }

}
