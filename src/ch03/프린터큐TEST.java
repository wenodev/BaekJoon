package ch03;


import java.util.*;

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

        //스캐너 클래스 호출
        Scanner sc = new Scanner(System.in);

        //테스트 케이스 입력
        int testCount = sc.nextInt();

        //정답 출력을 위한 변수
        int cnt=0;

        //Node형태로 큐 선언
        Queue<Node> queue = new LinkedList<>();

        //비교를 위한 우선선위큐 선언
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());


        for (int i=0; i<testCount; i++){

            int n = sc.nextInt();
            int m = sc.nextInt();

            cnt = 0;

            //큐와 우선선위 큐 초기화
            for (int j=0; j<n; j++){
                int priority = sc.nextInt();
                queue.add(new Node(j, priority));
                priorityQueue.add(priority);
            }

            while(true){
                Node node = queue.poll();

                //현재 중요도와 우선순위 큐의 중요도가 같은지 비교
                if(node.priority == priorityQueue.peek()){
                    cnt++;

                    priorityQueue.poll();
                    if (node.priority == m){
                        System.out.println(cnt);
                        break;
                    }
                }

                // 현재 중요도와 다르면 현재 큐를 가장 마지막으로 이동
                else {
                    queue.add(new Node(node.priority, node.index));
                }

            }

        }

    }
}
