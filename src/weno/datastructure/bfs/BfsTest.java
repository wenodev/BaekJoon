package weno.datastructure.bfs;

public class BfsTest {

    public static void main(String args[]) {
        Graph g = new Graph(10);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0,5);
        g.addEdge(1, 2);
        g.addEdge(1,9);
        g.addEdge(2, 3);
        g.addEdge(3, 3);


        g.print();
        System.out.println("=========");

        /* 주어진 노드를 시작 노드로 BFS 탐색 */
        g.BFS(0);

    }

}
