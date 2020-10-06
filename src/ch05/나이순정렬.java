package ch05;

import java.util.*;

public class 나이순정렬 {


    static class Node{
        int age;
        String name;

        Node(int age, String name){
            this.age = age;
            this.name = name;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<Node> nodeList = new ArrayList<>();

        for (int i=0; i<count; i++){
            int age = sc.nextInt();
            String name = sc.next();
            nodeList.add(new Node(age, name));
        }

        Collections.sort(nodeList, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });

        for (Node node : nodeList){
            System.out.println(node.age);
            System.out.println(node.name);
        }


    }
}
