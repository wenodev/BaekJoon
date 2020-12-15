package weno;

import java.util.Iterator;
import java.util.LinkedList;

public class GmlDfs {

    static class Graph{

        private int MAX;   // 노드의 개수
        private LinkedList<Integer> adj[]; // 인접 리스트

        /** 생성자 */
        Graph(int max) {

            this.MAX = max;
            adj = new LinkedList[MAX];
            for (int i = 0; i < max; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        /** 노드를 연결 v->w */
        void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v);
        }

        /** DFS에 의해 사용되는 함수 */
        void DFSUtil(int start, boolean visited[]) {
            visited[start] = true;
            System.out.print(start + " ");

            Iterator<Integer> i = adj[start].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if (!visited[n]) DFSUtil(n, visited);
            }
        }

        /** 주어진 노드를 시작 노드로 DFS 탐색 */
        void DFS(int start) {
            boolean[] visited = new boolean[MAX];
            DFSUtil(start, visited);
        }

        /** DFS 탐색 */
        void DFS() {
            boolean visited[] = new boolean[MAX];
            int count = 0;

            for (int i = 0; i < MAX; i++) {
                if (visited[i] == false){
                    DFSUtil(i, visited);
                    count++;
                }
            }
            System.out.println(" ");
            System.out.println("count : " + count);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(4,4);

        g.DFS();
    }



}
