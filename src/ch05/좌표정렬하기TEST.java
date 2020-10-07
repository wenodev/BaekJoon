package ch05;

import java.util.*;

public class 좌표정렬하기TEST {


    static class Node{
        int x;
        int y;

        Node(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Node> nodes = new ArrayList<>();

        for (int i=0; i<count; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            nodes.add(new Node(x,y));

        }

        Collections.sort(nodes, Comparator.comparing(Node::getX).thenComparing(Node::getY));

        for (Node node : nodes){
            System.out.println(node.x);
            System.out.println(node.y);
        }


    }

}
