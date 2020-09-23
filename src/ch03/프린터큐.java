package ch03;


import java.util.*;


public class 프린터큐 {

    public static class Node {
        private int priority;
        private int index;

        public Node(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc, n, m, cnt;
        System.out.print("테스트 케이스 : ");
        tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            Queue<Node> q = new LinkedList<Node>();
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); // 높은 중요도부터 처리
            cnt = 0;
            System.out.print("배열 몇개? : ");
            n = sc.nextInt();
            System.out.print("몇번째인지 궁금한 문서의 위치 : ");
            m = sc.nextInt();

            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                q.add(new Node(x, j)); // {중요도, 인덱스} 삽입
                pq.add(x); // 중요도 삽입  (내림차순)
            }

            while (true) {
                Node node = q.poll();

                // 가장 중요도가 높은 경우 출력
                if (node.priority == pq.peek()) {
                    cnt++;
                    System.out.println("cnt : " + cnt);
                    pq.poll();
                    if (node.index == m) {
                        System.out.println(cnt);
                        break;
                    }
                } else {
                    q.add(new Node(node.priority, node.index));
                }
            }
        }
    }
}

