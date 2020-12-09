package weno.program;

import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {

    static class Node {
        String next;
        int edge;

        public Node(String next, int edge) {
            this.next = next;
            this.edge = edge;
        }
    }

    static boolean isNext(String cur, String n) {
        int cnt = 0;
        for (int i=0; i<n.length(); i++) {
            if (cur.charAt(i) != n.charAt(i)) {
                if (++ cnt > 1) return false;
            }
        }

        return true;
    }

    public static int solution(String begin, String target, String[] words) {
        int n = words.length, ans = 0;
        Queue<Node> q = new LinkedList<>();

        boolean[] visit = new boolean[n];
        q.add(new Node(begin, 0));

        while(!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.next.equals(target)) {
                ans = cur.edge;
                break;
            }

            for (int i=0; i<n; i++) {
                if (!visit[i] && isNext(cur.next, words[i])) {
                    visit[i] = true;
                    q.add(new Node(words[i], cur.edge + 1));
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words ={"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution(begin, target, words));

    }


}
