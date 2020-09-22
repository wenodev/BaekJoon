package ch03;


import java.util.Scanner;

public class 프린터큐TEST {

    public static class Node{

        private int priority;
        private int index;

        public Node(int priority, int index){
            this.priority = priority;
            this.index = index;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCount = sc.nextInt();

        int arrayLength = sc.nextInt();
        int arrayData = sc.nextInt();

        int[] array = new int[arrayLength];


        for (int i=0; i<arrayLength; i++){
            array[i] = sc.nextInt();
        }






    }
}
