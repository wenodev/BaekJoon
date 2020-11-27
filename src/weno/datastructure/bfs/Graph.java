package weno.datastructure.bfs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    public int SIZE; // 노드의 개수
    public LinkedList<Integer> adj[]; // 인접 리스트

    /** 생성자 */
    public Graph(int v) {
        this.SIZE = v;
        adj = new LinkedList[v];

        for (int i = 0; i < SIZE; i++) {
            adj[i] = new LinkedList<>();
        }

    }

    void addEdge(int x, int y) {
        adj[x].add(y);
    }

    void BFS(int data) {

        LinkedList<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[SIZE];
        visited[data] = true;

        queue.add(data);


        while(queue.size() != 0){

            data = queue.poll();
            System.out.print(data + " ");

            Iterator<Integer> iterator = adj[data].listIterator();
            while(iterator.hasNext()){
                int num = iterator.next();

                if (!visited[num]){
                    visited[num] = true;
                    queue.add(num);
                }

            }
        }
    }

    void print() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " -> " );
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print( adj[i].get(j) + " ");
            }
            System.out.println(" ");
        }
    }

}
