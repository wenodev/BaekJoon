package weno.datastructure.dfs;

public class DfsTest {
    public static void main(String[] args) {

        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.DFS(0); /* 주어진 노드를 시작 노드로 DFS 탐색 */
    }
}
