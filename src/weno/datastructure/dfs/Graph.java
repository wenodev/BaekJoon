package weno.datastructure.dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    public int SIZE;
    public LinkedList<Integer> adj[];

    public Graph(int size){
        this.SIZE = size;
        adj = new LinkedList[SIZE];

        for (int i = 0; i < SIZE; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int x, int y){
        adj[x].add(y);
    }

    public void DFSUtil(int data, boolean visited[]){

        visited[data] = true;
        System.out.print(data + " ");

        Iterator<Integer> iterator = adj[data].listIterator();
        while(iterator.hasNext()){
            int num = iterator.next();

            if (!visited[num]){
                DFSUtil(num, visited);
            }
        }
    }

    public void DFS(int data){
        boolean visited[] = new boolean[SIZE];
        DFSUtil(data, visited);
    }

}
