package ch05;

import java.util.*;


public class 좌표정렬하기 {

    static class Node{
        int coordinate1;
        int coordinate2;

        Node(int coordinate1, int coordinate2){
            this.coordinate1 = coordinate1;
            this.coordinate2 = coordinate2;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Node> nodeList = new ArrayList<>();

        for (int i=0; i<count; i++){

            int coordinate1 = sc.nextInt();
            int coordinate2 = sc.nextInt();

            nodeList.add(new Node(coordinate1, coordinate2));
        }

        Collections.sort(nodeList, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {

                if (o1.coordinate1 == o2.coordinate1){
                    return Integer.compare(o1.coordinate2, o2.coordinate2);
                }

                return Integer.compare(o1.coordinate1, o2.coordinate1);
            }


        });

        for (Node node : nodeList){
            System.out.println(node.coordinate1);
            System.out.println(node.coordinate2);
        }


    }
}
